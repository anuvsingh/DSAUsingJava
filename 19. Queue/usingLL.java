import java.util.LinkedList;

public class usingLL {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        // Adding
        public static void enque(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // Removing
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }
        // Front
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        while (!ll.isEmpty()) {
            System.out.println(ll.peek());
            ll.remove();
        }
    }
}