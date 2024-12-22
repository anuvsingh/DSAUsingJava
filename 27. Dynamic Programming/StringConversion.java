public class StringConversion {
    public static int[] convertString(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        //find the LCS length
        int lcsLen = lcs(str1, str2, m, n);
        //calculate deletions and insertions
        int delete = m - lcsLen;
        int insert = n - lcsLen;
        return new int[] {delete, insert};
    }
    public static int lcs(String str1, String str2, int m, int n){
        int dp[][] = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String str1 = "heap";
        String str2 = "pea";
        int result[] = convertString(str1, str2);
        System.out.println("Deletions: " + result[0]);
        System.out.println("Insertions: " + result[1]);

    /*
     * Deletions will be of 2 characters 'h' and 'p'.
     * Insertions will be of 1 character i.e., 'p'.
     */
    }
}