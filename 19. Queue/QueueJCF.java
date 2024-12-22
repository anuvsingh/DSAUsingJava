// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJCF {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
                        // OR
        // Queue <Integer> al = new ArrayList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}