import java.util.PriorityQueue;

public class PriorityQueueInJCF {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(3);  // add operation - O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        System.out.print("Priority Queue: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");  // peek operation - O(1)
            pq.remove(); // remove or pop operation - O(log n)
        }
    }
}