import java.util.Scanner;

public class keyOccurences {
    public static void allOccurences (int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurences(arr, key, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter ELements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Key: ");
        int key = sc.nextInt();
        System.out.print("Key " +key+ " is at Index: ");
        allOccurences(arr, key, 0);
        System.out.println();
    }
}