import java.util.Scanner;

public class Majority_elements {
    
    private static int countInRange (int nums[], int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count ++;
            }
        }
        return count;
    }

    private static int majorityElementRec (int nums[], int lo, int hi) {
        // BASE CASE
        if (lo == hi) {
            return nums[lo];
        }
        // reverse on left and right halves of this slice
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);
        // if the two halves agree on majority element, then return it
        if (left == right) {
            return left;
        }
        // otherwise, count each element and return the "winner"
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);
        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement (int nums[]) {
        return majorityElementRec(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        System.out.print("Enter Elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Majority Element is " + majorityElement(arr));
    }
}