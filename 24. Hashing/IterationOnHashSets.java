import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSets {
    public static void main(String[] args) {
        HashSet <String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // 1. Using Iterators
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        // 2. Using Enhanced for loop
        for(String city: cities){
            System.out.print(city + " ");
        }
    }
}