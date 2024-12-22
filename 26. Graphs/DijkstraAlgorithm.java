import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int node, path;

        public Pair(int node, int path) {
            this.node = node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // Path-based sorting
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int[] distances = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            distances[i] = Integer.MAX_VALUE;
        }
        distances[src] = 0; // Distance to source is 0

        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.remove();
            if (!visited[current.node]) {
                visited[current.node] = true;

                for (Edge edge : graph[current.node]) {
                    int u = edge.src;
                    int v = edge.dest;
                    int weight = edge.wt;

                    if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                        distances[v] = distances[u] + weight;
                        pq.add(new Pair(v, distances[v]));
                    }
                }
            }
        }

        // Print the distances from the source
        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("To " + i + " -> " + distances[i]);
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        dijkstra(graph, src);
    }
}