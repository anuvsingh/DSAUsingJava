import java.util.ArrayList;

public class PathsFromSrcToTarget {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 4));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dest, String path, boolean[] visited) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        }

        visited[src] = true; // Mark the current node as visited
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visited[e.dest]) {
                printAllPaths(graph, e.dest, dest, path + src + " -> ", visited);
            }
        }
        visited[src] = false; // Backtrack
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 5;
        int dest = 1;

        boolean[] visited = new boolean[V]; // To keep track of visited nodes
        printAllPaths(graph, src, dest, "", visited);
    }
}