import java.util.Scanner;

public class MountainRanges {
    public static int mountainRange(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<n+1; i++){
            for (int j = 0; j < i; j++) {
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pairs of strokes: ");
        int n = sc.nextInt();
        System.out.println("Number of Mountains can be Made: " + mountainRange(n));
    }
}