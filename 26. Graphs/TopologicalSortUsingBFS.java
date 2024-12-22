import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortUsingBFS {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    // Topological Sorting is only valid for DAG (directed graph with no cycles).
    // Create a DAG (directed acyclic graph).
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 5));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 5));
    }
                                        // Kahn's Algorithm
    public static void calcIndeg(ArrayList <Edge> graph[], int indeg[]){
        for(int i=0; i<graph.length; i++){
            int v=i;
            for(int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList <Edge> graph[]){
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue <Integer> q = new LinkedList<>();
        for(int i=0; i<indeg.length; i++){
            if (indeg[i] == 0) {
                q.add(i);
            }
        }
        //bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");   //topological sort print
            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList <Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topSort(graph);
    }
}