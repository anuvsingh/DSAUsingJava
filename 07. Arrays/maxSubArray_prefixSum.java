import java.util.Scanner;

public class maxSubArray_prefixSum {

    public static void max_subarray_sum (int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix [0] = numbers [0];
        // Calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.print(currSum + " ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max SubArray Sum: ");
        max_subarray_sum(arr);
    }
}