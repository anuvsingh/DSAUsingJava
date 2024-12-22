import java.util.*;

public class ReversingFirstKelements {
    static class Cell {
        int x, y;
        int dis;
        public Cell(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    static boolean isInside(int x, int y, int N) {
        return x >= 1 && x <= N && y >= 1 && y <= N;
    }

    static int minStepToReachTarget(int knightPos[], int targetPos[], int N) {
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        // Use a queue instead of a Vector
        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(knightPos[0], knightPos[1], 0));

        boolean visit[][] = new boolean[N + 1][N + 1];
        visit[knightPos[0]][knightPos[1]] = true;

        while (!queue.isEmpty()) {
            Cell t = queue.poll(); // Remove the first element

            // If the knight reaches the target
            if (t.x == targetPos[0] && t.y == targetPos[1]) {
                return t.dis;
            }

            // Explore all possible moves
            for (int i = 0; i < 8; i++) {
                int x = t.x + dx[i];
                int y = t.y + dy[i];

                if (isInside(x, y, N) && !visit[x][y]) {
                    visit[x][y] = true;
                    queue.add(new Cell(x, y, t.dis + 1));
                }
            }
        }

        return Integer.MAX_VALUE; // In case no solution is found
    }

    public static void main(String[] args) {
        int N = 30;
        int knightPos[] = {1, 1};
        int targetPos[] = {30, 30};
        System.out.println(minStepToReachTarget(knightPos, targetPos, N));
    }
}
