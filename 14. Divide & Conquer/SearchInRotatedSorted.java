import java.util.Scanner;

public class SearchInRotatedSorted {

    public static int search (int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        // KAAM
        int mid = si + (ei - si) / 2; // OR (si + ei) / 2
        // CASE FOUND
        if (arr[mid] == target) {
            return mid;
        }
        // mid on line1
        if (arr[si] <= arr[mid]) {
            // case a: left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid-1);
            } 
            // case b: right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }
        // mid on line2
        else {
            // case c: right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case d: left
            else {
                return search(arr, target, si, mid - 1);
            }
        }
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
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        int tarIdx = search(arr, target, 0, size-1);
        System.out.println("Index of the Target is: " + tarIdx);
    }
}