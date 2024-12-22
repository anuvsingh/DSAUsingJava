import java.util.ArrayList;

public class OperationsOnAL {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        // ADD ELEMENT -- O(1)
        System.out.println("---Adding Element---");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // Adding at a specific index -- O(n)
        System.out.println("---Adding at Specific Index---");
        list.add(1,9);
        System.out.println(list);
        // GET ELEMENT -- O(1)
        System.out.println("---Get an Element---");
        int element = list.get(2); 
        System.out.println(element);
        // DELETE ELEMENT -- O(n)
        System.out.println("---Delete an Element---");
        list.remove(1);
        System.out.println(list);
        // SET ELEMENT -- O(n)
        System.out.println("---Set an Element---");
        list.set(2, 10);
        System.out.println(list);
        // CONTAINS ELEMENT -- O(n)
        System.out.println("---Check Contains Element---");
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}