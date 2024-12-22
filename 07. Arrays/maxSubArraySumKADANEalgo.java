import java.util.Scanner;
public class maxSubArraySumKADANEalgo {
    
    public static void kadanes(int numbers[]) {
         
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0; 
        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.print("Our Max Sub-Array Sum is: " + maxSum);

        // If all numbers are negative then use the following code:
        /*
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int max_element = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            max_ending_here = Math.max(max_ending_here + numbers[i], 0);
            max_so_far = Math.max(max_ending_here, max_so_far);
            max_element = Math.max(max_element, numbers[i]);
        }
        if (max_so_far == 0) {
            max_so_far = max_element;
        }
        System.out.println(max_so_far);
        */
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("By Kadane's Algorithm");
        // System.out.print("Max Sub-Array Sum: ");
        kadanes(arr);
    }
}