import java.util.*;

public class MaxOfAllSubarrOfSizeK {
    public static void printMax(int arr[], int n, int k) {
        // Create a deque to store indices of array elements
        Deque<Integer> Qi = new LinkedList<Integer>();

        // Process the first k elements of the array
        int i;
        for (i = 0; i < k; ++i) {
            // Remove elements smaller than the current one, as they are useless
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            // Add the current element at the rear of the deque
            Qi.addLast(i);
        }

        // Process the rest of the elements
        for (; i < n; ++i) {
            // The element at the front of the deque is the largest of the previous window
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which are out of this window
            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Remove all elements smaller than the current element
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            // Add the current element at the rear of the deque
            Qi.addLast(i);
        }

        // Print the maximum element of the last window
        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
