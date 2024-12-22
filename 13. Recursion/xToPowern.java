import java.util.Scanner;

public class xToPowern {  // TIME COMPLEXITY - O(n)
    public static int power (int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
            // OR for above 3 lines you can write the below 1 line.
        // return x * power(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter the power value: ");
        int pow = sc.nextInt();
        System.out.println(base+ "^" +pow+ " is: " +power(base, pow));
    }
}