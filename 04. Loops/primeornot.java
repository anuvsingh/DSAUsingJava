import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        
        boolean isPrime = true;
        for (int i=2; i <= n-1; i++) {
            if(n % i == 0) { // n is a multiple of i (i != 1 or n)
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println(n + " is a Prime Number.");
        }
        else {
            System.out.println(n + " is not a Prime Number.");
        }
    }
}