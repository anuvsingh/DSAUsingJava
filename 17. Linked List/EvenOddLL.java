public class EvenOddLL {
    public static Node head;
    public static class Node {
        int data;                   // Time Complexity - O(n)
        Node next;                  // Space Complexity - O(1)
        Node (int d) {
            data = d;
            next = null;
        }
    }
    public static void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;
        while (end.next != null) {
            end = end.next;
        }
        Node new_end = end;
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else {
            prev = curr;
        }
        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }
    public static void push (int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        push(7);
        push(8);
        push(9);
        push(10);
        System.out.print("Linked List: ");
        printList();
        segregateEvenOdd();
        System.out.print("Updated Linked List: ");
        printList();
    }
}