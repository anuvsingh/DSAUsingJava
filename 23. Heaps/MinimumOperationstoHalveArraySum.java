import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumOperationstoHalveArraySum {
    static int minops(ArrayList<Integer> nums) {
        // Calculate the total sum of the array
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // Use a max-heap (simulated using negative values in a priority queue)
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> Double.compare(b, a));
        for (int num : nums) {
            pq.add((double) num);
        }

        double temp = sum;
        int cnt = 0;

        // Halve the largest element until the sum is reduced to half
        while (temp > sum / 2) {
            double x = pq.poll(); // Get the largest element
            temp -= x / 2;
            pq.add(x / 2); // Add half of it back to the heap
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(10, 20, 7));
        int count = minops(nums);
        System.out.println("Minimum operations to halve the array sum: " + count);
    }
}
