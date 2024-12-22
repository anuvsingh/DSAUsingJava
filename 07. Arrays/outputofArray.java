import java.util.Scanner;

public class outputofArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Creation of an Array
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Input of an Array
        System.out.println("Enter the Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Output of an array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at Index-" +i+ ":" +arr[i]);
        }
    }
}