import java.util.Scanner;

public class LastOccurence {
    
    public static int lastOccurence (int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Key value: ");
        int key = sc.nextInt();
        System.out.print("Enter Index i: ");
        int i = sc.nextInt();
        System.out.println("Last Occurence of " +key+ " is at Index: " +lastOccurence(arr, key, i));
    }
}