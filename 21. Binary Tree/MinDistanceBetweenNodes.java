public class MinDistanceBetweenNodes {
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
    public static Node lca(Node root, int n1, int n2){
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rigthLca = lca(root.right, n1, n2);
        if (rigthLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rigthLca;
        }
        return root;
    }
    public static int lcaDist(Node root, int n){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDistance = lcaDist(root.left, n);
        int rightDistance = lcaDist(root.right, n);
        if (leftDistance == -1 && rightDistance == -1) {
            return -1;
        } else if(leftDistance == -1){
            return rightDistance + 1;
        } else {
            return leftDistance + 1;
        }
    }
    public static int minDist(Node root, int n1, int n2){
        Node Lca = lca(root, n1, n2);
        int dist1 = lcaDist(Lca, n1);
        int dist2 = lcaDist(Lca, n2);
        return dist1 + dist2;
    }
    public static void main(String[] args) {
        /*
         *              1
         *            /   \
         *           2     3
         *          / \   / \
         *         4   5 6   7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 6;
        System.out.println("Min Distance Between "+n1+" & "+n2+" is: " + minDist(root, n1, n2)); 
    }
}