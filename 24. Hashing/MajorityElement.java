import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Time Complexity - O(n)
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1); // Correct frequency increment
            } else {
                map.put(arr[i], 1);
            }
        }
        int majorityThreshold = arr.length / 2; // Majority condition
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            if (map.get(key) > majorityThreshold) {
                System.out.println("Majority Element: " + key);
                return; // Exit once a majority element is found
            }
        }

        System.out.println("No Majority Element found.");
    }
}