import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithinKseats {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }
    public static void createGraph(int flights[][], ArrayList <Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<flights.length; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }
    static class Info{
        int v;
        int cost;
        int stops;
        public Info(int v, int c, int s){
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }
    public static int cheapestFlight(int n, int flight[][], int src, int dest, int k){
        ArrayList <Edge> graph[] = new ArrayList[n];
        createGraph(flight, graph);
        int dist[] = new int[n];
        for(int i=0; i<n; i++){
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue <Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops > k) {
                break;
            }
            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if (curr.cost + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int n = 4; // Number of cities (nodes)
        int flights[][] = {
            {0, 1, 100},
            {1, 2, 100},
            {2, 3, 100},
            {0, 2, 500}
        };
        int src = 0; // Starting city
        int dest = 3; // Destination city
        int k = 1; // Maximum number of stops allowed
    
        int result = cheapestFlight(n, flights, src, dest, k);
        if (result != -1) {
            System.out.println("The cheapest flight cost from city " + src + " to city " + dest + " with at most " + k + " stops is: " + result);
        } else {
            System.out.println("There is no route from city " + src + " to city " + dest + " with at most " + k + " stops.");
        }
    }
    
}