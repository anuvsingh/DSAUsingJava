import java.util.Scanner;

public class reverseOfArrays {
    
    public static void reversing (int numbers[]) {
        int first = 0, last = numbers.length-1;

        while (first < last) {

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse of Array: ");
        reversing(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}