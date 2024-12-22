import java.util.Scanner;

public class insertionSort {
    
    public static void printArr (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void insertion_sort (int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // Finding out the right position to do insertion
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev+1] = curr;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements of an Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insertion_sort(arr);
        System.out.print("Sorted Array: ");
        printArr(arr);
    }
}