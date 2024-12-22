public class LoopInLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static boolean isCycle() {   // Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if (slow == fast) {
                return true; //cycle exists
            }
        }
        return false; //cycle doesn't exist
    }
        // This print function will give infinite loop.
    /*  public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        } */
    public void print() {
        Node temp = head;
        Node slow = head;
        Node fast = head;
        boolean cycleDetected = false;
        while (temp != null) {
            System.out.print(temp.data + "->");
            if (slow != null) {
                slow = slow.next;
            }
            if (fast != null && fast.next != null) {
                fast = fast.next.next;
            }
            // Detect the cycle
            if (slow == fast) {
                cycleDetected = true;
                break;
            }
            temp = temp.next;
        }
        if (cycleDetected) {
            System.out.println("Cycle Detected at Node with value: " + temp.data);
        } else {
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        LoopInLL ll = new LoopInLL();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println("Cycle exists: " + isCycle());
        ll.print();
    }
}