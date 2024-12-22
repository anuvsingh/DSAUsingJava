public class KthLargeOddNumInRange {
    public static int kthOdd(int range[], int K){
        if (K <= 0) {           //Time Complexity - O(1)
            return 0;           //Space Complexity - O(1)
        }
        int L = range[0];
        int R = range[1];
        if ((R & 1) > 0) {
            int Count = (int) Math.ceil((R-L+1)/2);
            if (K > Count) {
                return 0;
            } else {
                return (R-2*K+2);
            }
        } else {
            int count = (R-L+1)/2;
            if (K > count) {
                return 0;
            } else {
                return (R-2*K+1);
            }
        }
    }
    public static void main(String[] args) {
        int range[] = {-10, 10};
        int k = 2;
        System.out.println(kthOdd(range, k)); // 7 will be second largest odd number in range of -10 and 10.
    }
}