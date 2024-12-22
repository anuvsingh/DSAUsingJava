import java.util.Scanner;

public class MinimumPartitioning {
    public static int minPartiton(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int W = sum/2;
        int dp[][] = new int[n+1][W+1];
        // bottom up
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {
                if (arr[i-1] <= j) {
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum partitioning difference: " + minPartiton(arr));

        sc.close();
    }
}