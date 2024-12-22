public class OperationOnLL {
    public static class Node {
        // Making a Linked List
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head; // HEAD
    public static Node tail; // TAIL
    public void addFirst (int data) {
        // Adding at beginning of Linked list
        //S1: Create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //S2: New node next = head
        newNode.next = head;
        //S3: Head = newNode
        head = newNode; 
    }
    public void addLast (int data) {
        // Adding at last of Linked list
        Node newNode = new Node(data);
        if (head == tail) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        OperationOnLL ll = new OperationOnLL();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}