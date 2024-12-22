public class RedBlackTree {
    public Node root; // Root node

    public RedBlackTree() {
        root = null;
    }

    class Node {
        int data;
        Node left, right, parent;
        char colour; // 'R' or 'B'

        Node(int data) {
            this.data = data;
            this.left = this.right = this.parent = null;
            this.colour = 'R';
        }
    }

    // Flags to track rotation cases
    boolean ll = false, rr = false, lr = false, rl = false;

    // Function to perform left rotation
    Node rotateLeft(Node node) {
        Node x = node.right;
        Node y = x.left;
        x.left = node;
        node.right = y;
        node.parent = x;
        if (y != null) y.parent = node;
        return x;
    }

    // Function to perform right rotation
    Node rotateRight(Node node) {
        Node x = node.left;
        Node y = x.right;
        x.right = node;
        node.left = y;
        node.parent = x;
        if (y != null) y.parent = node;
        return x;
    }

    // Helper function for insertion
    Node insertHelp(Node root, int data) {
        boolean redConflict = false;

        if (root == null) return new Node(data);

        if (data < root.data) {
            root.left = insertHelp(root.left, data);
            root.left.parent = root;

            if (root != this.root && root.colour == 'R' && root.left.colour == 'R') {
                redConflict = true;
            }
        } else {
            root.right = insertHelp(root.right, data);
            root.right.parent = root;

            if (root != this.root && root.colour == 'R' && root.right.colour == 'R') {
                redConflict = true;
            }
        }

        // Rotations and recolouring
        if (ll) {
            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';
            ll = false;
        } else if (rr) {
            root = rotateRight(root);
            root.colour = 'B';
            root.right.colour = 'R';
            rr = false;
        } else if (rl) {
            root.right = rotateRight(root.right);
            root.right.parent = root;
            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';
            rl = false;
        } else if (lr) {
            root.left = rotateLeft(root.left);
            root.left.parent = root;
            root = rotateRight(root);
            root.colour = 'B';
            root.right.colour = 'R';
            lr = false;
        }

        // Handle red conflict
        if (redConflict) {
            if (root.parent.right == root) {
                if (root.parent.left == null || root.parent.left.colour == 'B') {
                    if (root.left != null && root.left.colour == 'R') rl = true;
                    else if (root.right != null && root.right.colour == 'R') ll = true;
                } else {
                    root.parent.left.colour = 'B';
                    root.colour = 'B';
                    if (root.parent != this.root) root.parent.colour = 'R';
                }
            } else {
                if (root.parent.right == null || root.parent.right.colour == 'B') {
                    if (root.left != null && root.left.colour == 'R') rr = true;
                    else if (root.right != null && root.right.colour == 'R') lr = true;
                } else {
                    root.parent.right.colour = 'B';
                    root.colour = 'B';
                    if (root.parent != this.root) root.parent.colour = 'R';
                }
            }
        }
        return root;
    }

    // Function to insert data into the tree
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            root.colour = 'B';
        } else {
            root = insertHelp(root, data);
        }
    }

    // Helper function to perform inorder traversal
    void inorderTraversalHelper(Node node) {
        if (node != null) {
            inorderTraversalHelper(node.left);
            System.out.print(node.data + " ");
            inorderTraversalHelper(node.right);
        }
    }

    // Function to perform inorder traversal
    public void inorderTraversal() {
        inorderTraversalHelper(root);
        System.out.println();
    }

    // Helper function to print the tree
    void printTreeHelper(Node root, int space) {
        if (root != null) {
            space += 10;
            printTreeHelper(root.right, space);
            System.out.println();
            for (int i = 10; i < space; i++) System.out.print(" ");
            System.out.println(root.data);
            printTreeHelper(root.left, space);
        }
    }

    // Function to print the tree
    public void printTree() {
        printTreeHelper(root, 0);
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        int[] arr = {1, 4, 6, 3, 5, 7, 8, 2, 9};
        for (int data : arr) {
            tree.insert(data);
            tree.inorderTraversal();
        }
        tree.printTree();
    }
}