public class UpdateOnST {
    static int tree[];

    // Initialize the segment tree
    public static void init(int n) {
        tree = new int[4 * n];
    }

    // Build the segment tree
    public static int buildST(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start + end) / 2;
        int left = buildST(arr, 2 * i + 1, start, mid);    // Left subtree
        int right = buildST(arr, 2 * i + 2, mid + 1, end); // Right subtree
        tree[i] = left + right; // Combine results
        return tree[i];
    }

    // Utility function to update the tree
    public static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if (idx > sj || idx < si) {
            return; // Out of range
        }
        tree[i] += diff; // Update current node
        if (si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff);     // Update left subtree
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff); // Update right subtree
        }
    }

    // Public function to handle updates
    public static void update(int arr[], int idx, int newVal) {
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal; // Update the array
        updateUtil(0, 0, n - 1, idx, diff); // Update the segment tree
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);

        // Print the tree (only meaningful elements)
        System.out.println("Segment Tree before update:");
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print(tree[i] + " ");
        }

        // Perform an update
        update(arr, 4, 10);
        System.out.println("\nSegment Tree after update:");
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}