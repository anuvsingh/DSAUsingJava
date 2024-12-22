public class FloodFillAlgorithm {
    public static void helper(int image[][], int sr, int sc, int color, boolean vis[][], int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        vis[sr][sc] = true; // Mark the current cell as visited
        image[sr][sc] = color; // Change the color of the current cell

        // Recursively call for all adjacent cells
        helper(image, sr, sc - 1, color, vis, orgCol); // left
        helper(image, sr, sc + 1, color, vis, orgCol); // right
        helper(image, sr - 1, sc, color, vis, orgCol); // up
        helper(image, sr + 1, sc, color, vis, orgCol); // down
    }

    public int[][] floodFill(int image[][], int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        int image[][] = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1; // Starting row index
        int sc = 1; // Starting column index
        int newColor = 2; // New color to fill

        FloodFillAlgorithm obj = new FloodFillAlgorithm();
        int result[][] = obj.floodFill(image, sr, sc, newColor);

        // Print the result
        System.out.println("Flood-filled image:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}