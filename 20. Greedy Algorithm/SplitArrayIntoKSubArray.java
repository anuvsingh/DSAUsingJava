public class SplitArrayIntoKSubArray {
    public static int ans = 10000000;
    public static void solve(int arr[], int n, int k, int index, int sum, int maxSum){
        if (k == 1) {
            maxSum = Math.max(maxSum, sum);             //Time Complexity - O((N-1)c(K-1))
            sum=0;                                      //Space Complexity - O(n)
            for(int i = index; i < n; i++){
                sum += arr[i];
            }
            maxSum = Math.max(maxSum, sum);
            ans = Math.min(ans, maxSum);
            return;
        }
        sum = 0;
        for(int i=index; i<n; i++){
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            solve(arr, n, k-1, i+1, sum, maxSum);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 3;  // k divisions
        int n = 4;  // size of an array
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans + "\n");
    }
}