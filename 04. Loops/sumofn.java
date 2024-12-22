import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // i = Iterator 
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.print("Sum is: " + sum);
    }
}