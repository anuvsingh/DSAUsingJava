public class Knapsack {
    // Recursion - O(2^n)
    public static int knapsackRec(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) { // valid
            // include
            int ans1 = val[n - 1] + knapsackRec(val, wt, W - wt[n - 1], n-1);
            // exclude
            int ans2 = knapsackRec(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return knapsackRec(val, wt, W, n - 1);
        }
    }

    // Memoization - O(n*W)
    public static int knapsackMemo(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        // Check if result is already calculated
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        // Check bounds for wt[n-1] and val[n-1]
        if (n > 0 && wt[n - 1] <= W) {
            int include = val[n - 1] + knapsackMemo(val, wt, W - wt[n - 1], n - 1, dp);
            int exclude = knapsackMemo(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(include, exclude);
        } else {
            dp[n][W] = knapsackMemo(val, wt, W, n - 1, dp);
        }
        return dp[n][W];
    }

    // Tabulation
    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        // Initialize 0th row and 0th column
        for (int i = 0; i <= n; i++) { // 0th column -> profit 0
            dp[i][0] = 0;
        }
        for (int j = 0; j <= W; j++) { // 0th row -> profit 0
            dp[0][j] = 0;
        }
        // Fill the dp table using bottom-up approach
        for (int i = 1; i <= n; i++) { // Items
            for (int j = 1; j <= W; j++) { // Capacity
                int v = val[i - 1]; // ith item value
                int w = wt[i - 1];  // ith item weight
                
                if (w <= j) { // Item can be included
                    int incProfit = v + dp[i - 1][j - w]; // Include the item
                    int excProfit = dp[i - 1][j];         // Exclude the item
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // Item cannot be included
                    dp[i][j] = dp[i - 1][j]; // Exclude the item
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        System.out.println(knapsackRec(val, wt, W, val.length));    // Recursion

        int dp[][] = new int[val.length + 1][W + 1]; // Allocate dp table of size (n+1) x (W+1)
        // Initialize the dp table with -1
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsackMemo(val, wt, W, val.length, dp));

        // Tabulation - O(n*W)
        int maxProfit = knapsackTab(val, wt, W);
        System.out.println(maxProfit);
    }
}