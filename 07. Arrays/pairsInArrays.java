import java.util.Scanner;

public class pairsInArrays {
    
    public static void pairs_arrays (int numbers[]) {
        int total_pairs = 0;  // Total pairs - n(n-1)/2
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" +curr+ "," +numbers[j]+ ")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " +total_pairs);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Pairs of Given Array:");
        pairs_arrays(arr);
    }
}