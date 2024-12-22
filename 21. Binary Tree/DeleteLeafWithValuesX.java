import java.util.*;

public class DeleteLeafWithValuesX {
    static class Node {
        int data;
        Node left, right;
    }

    // Method to create a new node
    static Node newNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    // In-order traversal of the tree
    static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Method to delete leaves with value x
    static Node deleteLeaves(Node root, int x) {
        if (root == null) {
            return null;
        }

        // Recursively call for left and right subtree
        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);

        // If the current node is a leaf and its value is equal to x
        if (root.left == null && root.right == null && root.data == x) {
            return null; // delete the leaf
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = newNode(10);
        root.left = newNode(3);
        root.right = newNode(10);
        root.left.left = newNode(3);
        root.left.right = newNode(1);
        root.right.right = newNode(3);
        root.right.right.left = newNode(3);
        root.right.right.right = newNode(3);

        System.out.println("In-order traversal before deleting leaves:");
        inOrder(root);

        int x = 3;
        root = deleteLeaves(root, x);

        System.out.println("\nIn-order traversal after deleting leaves with value " + x + ":");
        inOrder(root);
    }
}