import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        //Hash Map Implementation
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        //Printing of Linked Hash Map & Hash Map
        System.out.println(hm);
        System.out.println(lhm);
    }
}