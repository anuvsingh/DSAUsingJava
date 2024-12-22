class Node{
    int data;
    Node left, right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}
public class InvertBT {
    Node root;
    void mirror(){
        root = mirror(root);
    }
    Node mirror(Node node){
        if (node == null) {
            return node;
        }
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        node.left = right;
        node.right = left;
        return node;
    }
    void inOrder(){
        inOrder(root);
    }
    void inOrder(Node node){
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public static void main(String[] args) {
        InvertBT tree = new InvertBT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Inorder Traversal: ");
        tree.inOrder();
        System.out.println();
        tree.mirror();
        System.out.println("Inverted Inorder Traversal: ");
        tree.inOrder();
    }
}