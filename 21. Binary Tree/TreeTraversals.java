public class TreeTraversals {
    // Nodes Declaration
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // PreOrder - O(n)
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // InOrder - O(n)
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    // PostOrder - O(n)
    public static void postorder(Node root){
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        /*     1
            /    \
           2     3
          / \   / \
          4 5  6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.print("Pre-Order Traversal: ");
        preorder(root);
        System.out.print("InOrder Traversal: ");
        inorder(root);
        System.out.print("Post-Order Traversal: ");
        postorder(root);
    }
}