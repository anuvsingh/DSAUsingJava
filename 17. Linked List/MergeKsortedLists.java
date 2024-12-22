public class MergeKsortedLists {
    public static class Node {
        int data;                           // Time Complexity, O(nlogk)
        Node next;                          // Space Complexity, O(n)
        Node (int data) {
            this.data = data;
        }
    }
    public static Node SortedMerge (Node a, Node b) {
        Node result = null;
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        if (a.data <= b.data) {
            result = a;
            result.next = SortedMerge(a.next, b);
        } else {
            result = b;
            result.next = SortedMerge(a, b.next);
        }
        return result;
    }
    public static Node mergeKlists (Node arr[], int last) {
        while (last != 0) {
            int i=0, j=last;
            while (i < j) {
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if (i >= j) {
                    last = j;
                }
            }
        }
        return arr[0];
    }
    public static void printList (Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        int k=3; // No. of Linked Lists

        // Array of k Linked Lists
        Node arr[] = new Node[k];

        // Creating first Linked List: 1->3->5->7
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        // Creating second Linked List: 2->4->6->8
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        // Creating third Linked List: 0->10->11->12
        arr[2] = new Node(0);
        arr[2].next = new Node(10);
        arr[2].next.next = new Node(11);
        arr[2].next.next.next = new Node(12);

        // Merge all k linked lists
        Node head = mergeKlists(arr, k-1);

        // Print the final merged linked lists
        printList(head);
    }
}