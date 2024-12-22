public class CoinChange {
    public static int coinChange(int coins[], int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];
        //intialise - sum is 0
        // i->coins, j->sum/change
        for(int i=0; i<n+1; i++){
            dp[i][0] = 1;
        }
        for(int j=0; j<sum+1; j++){
            dp[0][j] = 0;
        }
        //O(n*sum)
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i-1] <= j) {
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {2, 5, 3, 6};
        int sum = 10;   //ans  = 5 i.e, {2, 2, 2, 2, 2} {2, 2, 3, 3} {2, 2, 6} {2, 3, 5} {5, 5}
        System.out.println("No. of way to give Coins Change is: " + coinChange(coins, sum));
    }
}