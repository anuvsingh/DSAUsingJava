import java.util.Scanner;
public class subArrays {
    public static void sub_arrays (int numbers[]) {
        int sa = 0;  // Total Sub-Arrays = n(n+1)/2
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                sa ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays: " +sa);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("SubArrays are:");
        sub_arrays(arr);
    }
}