import java.util.Scanner;

public class combination {
    
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;  
        }
        return fact;
    }

    public static int bincoef(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);
        int bincoef = n_fact / (r_fact * nr_fact);
        return bincoef;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of r: ");
        int r = sc.nextInt();
        int bc = bincoef(n, r);
        System.out.println("Binomial Coefficient is: " + bc);
    }
}