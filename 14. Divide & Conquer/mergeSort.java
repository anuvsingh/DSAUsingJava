import java.util.Scanner;

public class mergeSort {

    public static void merge (int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right Part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // Copying temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void merge_sort (int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2; // (si + ei) / 2
        merge_sort(arr, si, mid); // left part
        merge_sort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei);
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
        System.out.print("Enter elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After Performing Merge Sort: ");
        merge_sort(arr, 0,size-1);
        printArr(arr);
    }
}