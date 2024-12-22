import java.util.ArrayList;

public class BSTtoBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node balanceBST(Node root){
        // InOrder Sequence
        ArrayList <Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);
        // Sorted inOrder -> Balanced BST
        root = createBST(inorder, 0, inorder.size()-1);
        return root;
    }
    public static Node createBST(ArrayList <Integer> inorder, int st, int end){
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid+1, end);
        return root;
    }
    public static void getInOrder(Node root, ArrayList<Integer>inorder){
        if (root == null) {
            return;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        System.out.print("Original BST: ");
        preorder(root);
        System.out.println();
        root = balanceBST(root);
        System.out.print("Balanced BST: ");
        preorder(root);
    }
}