import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargestElementInAStream(int k) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
    }

    public List<Integer> getAllKthNumbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int val : arr) {
            if (minHeap.size() < k) {
                minHeap.add(val);
            } else {
                if (val > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(val);
                }
            }
            if (minHeap.size() >= k) {
                result.add(minHeap.peek());
            } else {
                result.add(-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1, 2, 3, 4, 5, 6};
        KthLargestElementInAStream stream = new KthLargestElementInAStream(k);
        List<Integer> res = stream.getAllKthNumbers(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
