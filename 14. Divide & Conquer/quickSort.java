import java.util.Scanner;

public class quickSort {
    
    public static void printArr (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int partition (int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements smaller than pivot.
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swapping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void quickSorting (int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // Last Element
        int pIdx = partition (arr, si, ei);
        quickSorting(arr, si, pIdx - 1); // left
        quickSorting(arr, pIdx + 1, ei); // right
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
        System.out.println("After Performing Quick Sort: ");
        quickSorting(arr, 0, size-1);
        printArr(arr);
    }
}