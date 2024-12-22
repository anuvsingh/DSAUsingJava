public class MaxBalancedStringPartitions {
    public static int BalancedPartition(String str, int n) {
        if (n == 0) {           //Time Complexity - O(n)
            return 0;           //Time Complexity - O(1)
        }
        int r = 0;
        int l = 0;
        int ans = 0;
        for (int i=0; i<n; i++){
            if (str.charAt(i) == 'R') {
                i++;
            } 
            else if(str.charAt(i) == 'L') {
                i++;
            }
            if (r == l) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();
        System.out.print(BalancedPartition(str, n));
    }
}