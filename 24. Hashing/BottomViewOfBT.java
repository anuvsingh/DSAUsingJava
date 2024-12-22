import java.util.TreeMap;

public class BottomViewOfBT {
    static class Node {
        int data;
        int hd;
        Node left, right;

        public Node(int key) {
            this.data = key;
            this.hd = Integer.MAX_VALUE;
            this.left = this.right = null;
        }
    }

    public static void bottomViewHelper(Node root, int curr, int hd, TreeMap<Integer, int[]> map) {
        if (root == null) {
            return;
        }

        // If no entry for this horizontal distance, or the current node is deeper
        if (!map.containsKey(hd) || map.get(hd)[1] <= curr) {
            map.put(hd, new int[]{root.data, curr});
        }

        // Recur for left and right subtrees
        bottomViewHelper(root.left, curr + 1, hd - 1, map);
        bottomViewHelper(root.right, curr + 1, hd + 1, map);
    }

    public static void printBottomView(Node root) {
        // Map to store horizontal distance, height, and node data
        TreeMap<Integer, int[]> map = new TreeMap<>();
        bottomViewHelper(root, 0, 0, map);

        // Print the bottom view stored in the map
        for (int[] val : map.values()) {
            System.out.print(val[0] + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println("Bottom View of Binary Tree: ");
        printBottomView(root);
    }
}
