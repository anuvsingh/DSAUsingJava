public class SwappingNodesInLL {
    public static class Node {
        int data;                       // Time Complexity - O(n)
        Node next;                      // Space Complexity - O(1)
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node head;
    public static void swapNodes (int x, int y) {
        if (x == y) {
            return;
        }
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null) {
            return;
        }
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public void push (int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }
    public static void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }
    public static void main(String[] args) {
        SwappingNodesInLL list = new SwappingNodesInLL();
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.print("Linked List Before: ");
        printList();
        System.out.println();
        swapNodes(4, 3);
        System.out.print("Linked List After: ");
        printList();
    }
}