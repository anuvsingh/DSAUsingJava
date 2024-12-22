import java.util.ArrayList;
import java.util.List;

public class BridgeInGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(List<ArrayList<Edge>> graph, int V) {
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));
        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 3));
        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 3));
        graph.get(3).add(new Edge(3, 1));
        graph.get(3).add(new Edge(3, 2));
    }

    public static void dfs(List<ArrayList<Edge>> graph, int curr, int par, int dt[], int low[], boolean vis[], int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            int neigh = e.dest;

            if (neigh == par) {
                continue;
            } else if (!vis[neigh]) {
                dfs(graph, neigh, curr, dt, low, vis, time);
                low[curr] = Math.min(low[curr], low[neigh]);

                if (dt[curr] < low[neigh]) {
                    System.out.println("Bridge: " + curr + " ---- " + neigh);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void tarjanBridge(List<ArrayList<Edge>> graph, int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        boolean vis[] = new boolean[V];
        int time = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        List<ArrayList<Edge>> graph = new ArrayList<>();
        createGraph(graph, V);
        tarjanBridge(graph, V);
    }
}