import java.util.ArrayList;

public class Merge2BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void getInOrder(Node root, ArrayList<Integer> arr){
        if (root == null) {
            return;
        }
        getInOrder(root.left, arr);
        arr.add(root.data);
        getInOrder(root.right, arr);
    }
    public static Node createBST(ArrayList <Integer> arr, int st, int end){
        if (st > end) {
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root; 
    }
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node mergeBSTs(Node root1, Node root2){
        // S1: Inorder Sequence = Sorted_1
        ArrayList <Integer> arr1 = new ArrayList<>();
        getInOrder(root1, arr1);

        // S2: Inorder Sequence = Sorted_2
        ArrayList <Integer> arr2 = new ArrayList<>();
        getInOrder(root2, arr2);

        // Merge
        int i=0, j=0;
        ArrayList <Integer> finalArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }
        // Sorted ArrayList -> Balanced BST
        return createBST(finalArr, 0, finalArr.size()-1);
    }
    public static void main(String[] args) {
        // BST-1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        System.out.print("BST 1: ");
        preorder(root1);
        System.out.println();
        // BST-2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        System.out.print("BST 2: ");
        preorder(root2);
        System.out.println();
        // Merging
        Node root = mergeBSTs(root1, root2);
        System.out.print("Merging Both BSTs: ");
        preorder(root);
    }
}