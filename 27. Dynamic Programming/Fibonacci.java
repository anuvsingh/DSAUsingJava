public class Fibonacci {

    // RECURSION - O(2^n)
    public static int fibRec(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        return fibRec(n-1) + fibRec(n-2);
    }

    // MEMOIZATION - O(n)
    public static int fibMemo(int n, int f[]){
        if (n==0 || n==1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibMemo(n-1, f) + fibMemo(n-2, f);
        return f[n];
    }

    // TABULATION - O(n)
    public static int fibTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=6;
        int f[] = new int[n+1]; //it's for memoization i.e, har i pe 0 store ho jayega
        System.out.println(fibMemo(n, f));
    }
}