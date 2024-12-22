import java.util.Scanner;

public class inputofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Elements of Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }
}