import java.util.LinkedList;    
public class LLinJCF {          // Java Collection Framework
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();    // Creation
        //Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll); // [0, 1, 2]
        //Remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll); // [1]
    }
}