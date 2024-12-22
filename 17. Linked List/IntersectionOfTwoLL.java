public class IntersectionOfTwoLL {
    public static class Node {
        int data;                       // Time Complexity - O(m*n)
        Node next;                      // Space Complexity - O(n)
        Node (int d) {
            data = d;
            next = null;
        }
    }
    public static Node getIntersectionNode (Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        // Creating two linked lists
        Node head1, head2;

        // Initialize the first and second linked list with one node
        head1 = new Node(10);
        head2 = new Node(3);

        // Adding more nodes to the second linked lists
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;

        // Adding intersection node(same node in both lists)
        newNode = new Node(15);
        head1.next = newNode; // Link node 15 to first list
        head2.next.next.next = newNode; // Link node 15 to the second list
        
        // Add one more node to the first linked list
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null; // End of the first linked list

        // Call the method to find intersection point
        Node interscetionPoint = getIntersectionNode(head1, head2);
        
        // Output the result
        if (interscetionPoint == null) {
            System.out.print("No Intersection Point");
        } else {
            System.out.print("Intersection Point: " + interscetionPoint.data);
        }
    }
}