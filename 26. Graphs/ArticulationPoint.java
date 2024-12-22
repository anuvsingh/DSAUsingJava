import java.util.ArrayList;

public class ArticulationPoint {

    // Class to represent edges in the graph
    static class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Method to find articulation points using Tarjan's Algorithm
    public static void getAP(ArrayList<Edge> graph[], int V) {
        int[] dt = new int[V]; // Discovery time of each vertex
        int[] low = new int[V]; // Lowest discovery time reachable from a vertex
        boolean[] vis = new boolean[V]; // Visited array
        boolean[] ap = new boolean[V]; // Articulation points array
        int time = 0; // Global time counter

        // Perform DFS for each unvisited vertex
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, time, vis, ap);
            }
        }

        // Print all articulation points
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.println("AP: " + i);
            }
        }
    }

    // DFS method
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int[] dt, int[] low, int time, boolean[] vis, boolean[] ap) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0; // Count of child vertices

        for (Edge e : graph[curr]) {
            int neigh = e.dest;

            if (neigh == par) {
                // Skip the parent vertex
                continue;
            }

            if (vis[neigh]) {
                // If neighbor is already visited, update low value
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                // Recur for the neighbor
                dfs(graph, neigh, curr, dt, low, time, vis, ap);

                // Update the low value of the current vertex
                low[curr] = Math.min(low[curr], low[neigh]);

                // Check if the current vertex is an articulation point
                if (par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                }

                children++;
            }
        }

        // If the current vertex is root and has more than one child, it is an articulation point
        if (par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    // Helper method to create a graph
    public static ArrayList<Edge>[] createGraph(int V) {
        ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        return graph;
    }

    public static void addEdge(ArrayList<Edge>[] graph, int src, int dest) {
        graph[src].add(new Edge(src, dest));
        graph[dest].add(new Edge(dest, src)); // Since the graph is undirected
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Edge>[] graph = createGraph(V);

        // Adding edges
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 4);

        // Finding articulation points
        getAP(graph, V);
    }
}