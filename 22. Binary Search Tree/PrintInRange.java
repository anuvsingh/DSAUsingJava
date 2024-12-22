public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void printInrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        // Only recurse left if the root's data is greater than k1
        if (root.data > k1) {
            printInrange(root.left, k1, k2);
        }
        // Print the root's data if it is within the range
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }
        // Only recurse right if the root's data is less than k2
        if (root.data < k2) {
            printInrange(root.right, k1, k2);
        }
    }
    
    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        System.out.print("Inorder Traversal of BST: ");
        inOrder(root);
        System.out.println();
        System.out.print("Printing in Given Range: ");
        printInrange(root, 3, 5);
    }
}