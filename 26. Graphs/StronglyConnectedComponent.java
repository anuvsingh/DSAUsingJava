import java.util.*;

class Edge {
    int src, dest;

    public Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class StronglyConnectedComponent {
    public static void topSort(ArrayList <Edge> graph[], int curr, boolean vis[], Stack <Integer> s){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void dfs(ArrayList <Edge> graph[], int curr, boolean vis[]){
        vis[curr] = true;
        System.out.print(curr + " ");
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void kosaraju(ArrayList <Edge> graph[], int v){
        Stack <Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];
        for(int i=0; i<v; i++){
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }
        ArrayList <Edge> transpose[] = new ArrayList[v];
        for(int i=0; i<graph.length; i++){
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }
        for(int i=0; i<v; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);   //e.src -> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                System.out.print("scc -> ");
                dfs(transpose, curr, vis);  //src
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int vertices = 5; // Number of vertices
        ArrayList<Edge> graph[] = new ArrayList[vertices];

        // Initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges to the graph
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[0].add(new Edge(0, 3));
        graph[3].add(new Edge(3, 4));

        // Call Kosaraju's algorithm to find SCCs
        kosaraju(graph, vertices);
    }
}