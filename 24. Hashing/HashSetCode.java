import java.util.HashSet;

public class HashSetCode {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);    // 1, 2, 4
        System.out.println(set.size()); // 3
        if (set.contains(2)) {
            System.out.println("Set contains 2");
        }
        set.remove(2);  //remove element 2
        if (set.contains(2)) {
            System.out.println("Set contains 2");   //Nothing will print
        }
        System.out.println(set.isEmpty());  //false
        System.out.println(set); // 1, 4
        set.clear();    //it will clear all set elements
        System.out.println(set.size()); //0
        System.out.println(set.isEmpty());  //true
    }
}