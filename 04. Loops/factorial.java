import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int factorial = 1;

        System.out.print("Enter the Number: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}