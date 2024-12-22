import java.util.Scanner;

public class BacktrackingOnArrays {
    public static void changeArr (int arr[], int i, int val) {
        // BASE CASE
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // RECURSION
        arr[i] = val;
        changeArr(arr, i+1, val+1);  // function call
        arr[i] = arr[i] - 2;  // backtracking
    }
    public static void printArr (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [8];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
