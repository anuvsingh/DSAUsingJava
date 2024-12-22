import java.util.Scanner;

public class Factorial {
    
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;                                      // SPACE COMPLEXITY = O(n)
    }                                                  // TIME COMPLEXITY = O(n)
    public static void main(String[] args) {  
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Factorial of " +n+ " is: ");
        System.out.println(fact(n));
    }
}