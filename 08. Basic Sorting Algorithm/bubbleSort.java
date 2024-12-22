import java.util.Scanner;

public class bubbleSort { // O(n^2)

    public static void bubble_sort (int arr[]) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int j = 0; j < arr.length-1-turn; j++) {
                if (arr[j] > arr[j+1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.print("Enter elements of an Array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        bubble_sort(num);
        System.out.print("Sorted Array: ");
        printArr(num);
    }
}