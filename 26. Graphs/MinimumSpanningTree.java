import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumSpanningTree {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 3, 50));
    }
    static class Pair implements Comparable <Pair>{
        int v;
        int cost;
        public Pair(int v, int c){
            this.v = v;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void prims(ArrayList <Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue <Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;  //MST cost/Total min weight
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;
                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("Final(min) cost of MST: " + finalCost);
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList <Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }
}