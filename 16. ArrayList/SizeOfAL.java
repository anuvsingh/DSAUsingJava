import java.util.ArrayList;

public class SizeOfAL {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Size of ArrayList is: " + list.size());
        // Traversing the ArrayList
        System.out.print("ArrayList is: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Reversing ArrayList
        System.out.print("Reverse of an ArrayList: ");
        for(int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}