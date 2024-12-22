import java.util.Scanner;

public class FibonacciNumber {
    
    public static int fib (int n) {
        if (n==0 || n==1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Nth Term: ");
        int n = sc.nextInt();
        System.out.print("The " +n+ "th term of Fibonacci Series is: ");
        System.out.println(fib(n));
    }
}