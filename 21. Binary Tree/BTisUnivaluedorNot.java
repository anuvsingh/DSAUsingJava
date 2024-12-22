public class BTisUnivaluedorNot {
    static class Node{
        int data;
        Node left;
        Node right;
    }
    static Node newNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return (temp);
    }
    static boolean isUnivalTree(Node root){
        if (root == null) {
            return true;
        }
        if (root.left != null && root.data != root.left.data) {
            return false;
        }
        if (root.right != null && root.data != root.right.data) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
    public static void main(String[] args) {
         /*     1
            /    \
           1     1
          / \   / \
         1  1  1  1
        */
        Node root = newNode(1);
        root.left = newNode(1);
        root.right = newNode(1);
        root.left.left = newNode(1);
        root.left.right = newNode(1);
        root.right.left = newNode(1);
        root.right.right = newNode(1);
        if (isUnivalTree(root)) {
            System.out.println("YES, Given Tree is Univalued.");
        } else {
            System.out.println("NO, Given Tree is not Univalued.");
        }
    }
}