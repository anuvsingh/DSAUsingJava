import java.util.Scanner;

public class CatalansNumber {
    //RECURSION - O(2^n)
    public static int catalanRec(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        int ans = 0; // Cn
        for (int i = 0; i <= n - 1; i++) { // Correct loop range
            ans += catalanRec(i) * catalanRec(n - i - 1);
        }
        return ans;
    }    
    //MEMOIZATION - O(n)
    public static int catalanMemo(int n, int dp[]){
        if (n==0 || n==1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            ans += catalanMemo(i, dp) * catalanMemo(n-i-1, dp);
        }
        return dp[n] = ans;
    }
    //TABULATION - O(n*n)
    public static int catalanTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Catalan Number using Recursion: " + catalanRec(n));

        int dp[] = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        System.out.println("Catalan Number using Memoization: " + catalanMemo(n, dp));

        System.out.println("Catalan Number using Tabulation: " + catalanTab(n));

        sc.close();
    }
}