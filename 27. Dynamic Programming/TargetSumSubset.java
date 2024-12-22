public class TargetSumSubset {
    public static boolean target_sum_subset(int arr[], int sum){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        //i = items & j = target sum
        for(int i=0; i<n+1; i++){
            dp[i][0] = true;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                int v = arr[i-1];
                if (v <= j && dp[i-1][j-v] == true) {   //include
                    dp[i][j] = true;
                } else if (dp[i-1][j] == true) {
                    dp[i][j] = true;    //exclude
                }
            }
        }
        print(dp);
        return dp[n][sum];
    }
    public static void print(boolean dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = {4, 2, 7, 1, 3};
        int targetSum = 10;
        System.out.println("Final Answer: " + target_sum_subset(num, targetSum));
    }
}