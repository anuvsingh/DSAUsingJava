import java.util.Scanner;

public class factorial {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;  
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int f = factorial(n);
        System.out.println("Factorial is: " + f);
    }
}