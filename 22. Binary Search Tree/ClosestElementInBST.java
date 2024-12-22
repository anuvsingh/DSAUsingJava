public class ClosestElementInBST {
    static int min_diff, min_diff_key;

    static class Node {
        int key;
        Node left, right;
    }

    static Node newNode(int key) {
        Node node = new Node();
        node.key = key;
        node.left = node.right = null;
        return node;
    }

    static void maxDiffUtil(Node ptr, int k) {
        if (ptr == null) {
            return;
        }

        if (ptr.key == k) {
            min_diff_key = k;
            return;
        }

        if (min_diff > Math.abs(ptr.key - k)) {
            min_diff = Math.abs(ptr.key - k);
            min_diff_key = ptr.key;
        }

        if (k < ptr.key) {
            maxDiffUtil(ptr.left, k);
        } else {
            maxDiffUtil(ptr.right, k);
        }
    }

    static int maxDiff(Node root, int k) {
        min_diff = Integer.MAX_VALUE; // Use Integer.MAX_VALUE for readability
        min_diff_key = -1;
        maxDiffUtil(root, k); // Call the utility function here
        return min_diff_key;
    }

    public static void main(String[] args) {
        Node root = newNode(9);
        root.right = newNode(17);
        root.left = newNode(4);
        root.left.left = newNode(3);
        root.left.right = newNode(6);
        root.left.right.left = newNode(5);
        root.left.right.right = newNode(7);
        root.right.right = newNode(22);
        root.right.right.left = newNode(20);

        int k = 18;
        System.out.println("Closest value to " + k + " is: " + maxDiff(root, k));
    }
}
