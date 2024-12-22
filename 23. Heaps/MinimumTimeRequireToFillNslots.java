import java.util.LinkedList;
import java.util.Queue;

public class MinimumTimeRequireToFillNslots {
    public static void minTime(int arr[], int N, int K) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[N + 1];
        int time = 0;

        // Add initially filled slots to the queue and mark them as visited
        for (int i = 0; i < K; i++) {
            q.add(arr[i]);
            vis[arr[i]] = true;
        }

        // Perform BFS to calculate the time required to fill all slots
        while (!q.isEmpty()) {
            int size = q.size(); // Fixed size for the current level
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                if (curr - 1 >= 1 && !vis[curr - 1]) {
                    vis[curr - 1] = true;
                    q.add(curr - 1);
                }
                if (curr + 1 <= N && !vis[curr + 1]) {
                    vis[curr + 1] = true;
                    q.add(curr + 1);
                }
            }
            time++;
        }

        // Subtract 1 as the last increment occurs after all slots are filled
        System.out.println(time - 1);
    }

    public static void main(String[] args) {
        int N = 6;
        int arr[] = {2, 5};
        int K = arr.length;
        minTime(arr, N, K);
    }
}