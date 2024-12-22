import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.print("Original List: ");
        System.out.println(list);
        System.out.print("Ascending Order: ");
        Collections.sort(list);
        System.out.println(list);
        System.out.print("Descending Order: ");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}