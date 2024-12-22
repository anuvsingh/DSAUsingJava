import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortByFrequency {
    public static String frequencySort(String s) {
        // Step 1: Count frequencies of each character
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Step 2: Create a max-heap (priority queue) based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() == a.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue()
        );

        pq.addAll(map.entrySet()); // Add all entries to the priority queue

        // Step 3: Build the result string
        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int val = entry.getValue();
            while (val > 0) {
                res.append(ch);
                val--;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Sorted by Frequency String is: " + frequencySort(str));
    }
}