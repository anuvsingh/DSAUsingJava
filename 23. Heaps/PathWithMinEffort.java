import java.util.PriorityQueue;

public class PathWithMinEffort {
    // A utility class to represent the coordinate of each cell
    static class Cell implements Comparable<Cell> {
        int x, y, cost;

        Cell(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Cell other) {
            return this.cost - other.cost;
        }
    }

    public static int minEffortPath(int grid[][]) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Directions for moving up, down, left, right
        int[] rowDir = {-1, 1, 0, 0};
        int[] colDir = {0, 0, -1, 1};

        // Priority queue for Dijkstra's algorithm
        PriorityQueue<Cell> pq = new PriorityQueue<>();
        pq.offer(new Cell(0, 0, grid[0][0]));

        // Array to track minimum cost to reach each cell
        int[][] minCost = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                minCost[i][j] = Integer.MAX_VALUE;
            }
        }
        minCost[0][0] = grid[0][0];

        while (!pq.isEmpty()) {
            Cell current = pq.poll();

            // If we reach the bottom-right cell, return the cost
            if (current.x == rows - 1 && current.y == cols - 1) {
                return current.cost;
            }

            // Traverse all possible directions
            for (int i = 0; i < 4; i++) {
                int newX = current.x + rowDir[i];
                int newY = current.y + colDir[i];

                // Check for valid bounds
                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                    int newCost = current.cost + grid[newX][newY];
                    // If a better cost is found, update minCost and add to queue
                    if (newCost < minCost[newX][newY]) {
                        minCost[newX][newY] = newCost;
                        pq.offer(new Cell(newX, newY, newCost));
                    }
                }
            }
        }

        // Return the minimum cost to reach the bottom-right cell
        return minCost[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        int result = minEffortPath(grid);
        System.out.println("The minimum cost to reach the bottom-right cell is: " + result);
    }
}