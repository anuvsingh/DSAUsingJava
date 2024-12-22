public class IterativeSearch {
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
    public static int size;
    public void addFirst (int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode; 
    }
    public void addLast (int data) {
        Node newNode = new Node(data);
        size++;
        if (head == tail) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void add (int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx -1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static int itrSearch (int key) {
        Node temp = head;
        int i = 0;
        while (temp !=  null) {
            if (temp.data == key) {
                return i;   // Key Found
            }
            temp = temp.next;
            i++;
        }
        return -1;  // Key not Found
    }
    public static void main(String[] args) {
        IterativeSearch ll = new IterativeSearch();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        System.out.print("Linked List: ");
        ll.print(); 
        System.out.println(itrSearch(3)); // at index 2
        System.out.println(itrSearch(10)); // not found (-1)
    }
}