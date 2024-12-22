import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCode {
    public static void main(String[] args) {

        HashSet <String> cities = new HashSet<>();
        cities.add("Ballia");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Varanasi");
        System.out.print("HashSet: ");
        System.out.println(cities);

        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("Ballia");
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Varanasi");
        System.out.print("LinkedHashSet: ");
        System.out.println(lhs);
    }
}