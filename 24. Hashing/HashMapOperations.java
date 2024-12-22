import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {
        
        // Create
        HashMap <String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        System.out.println("INSERT OPERATION");
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);

        // Get - O(1)
        System.out.println("GET OPERATION");
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        // Contains Key - O(1)
        System.out.println("CONTAINS KEY OPERATION");
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Ballia"));

        // Remove Key - O(1)
        System.out.println("REMOVE KEY OPERATION");
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size
        System.out.println("Size of HashMap: " + hm.size());

        // is Empty
        System.out.println("HashMap is Empty. " + hm.isEmpty());

        // Clear
        hm.clear();

        // is Empty
        System.out.println("HashMap is Empty. " + hm.isEmpty());
    }
}