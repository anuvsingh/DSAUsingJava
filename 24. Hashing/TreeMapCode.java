import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapCode {
    public static void main(String[] args) {

        //Tree Map Implementation
        TreeMap <String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 5);

        //Hash Map Implementation
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        //Printing HashMap & TreeMap
        System.out.println(tm);
        System.out.println(hm);
    }
}