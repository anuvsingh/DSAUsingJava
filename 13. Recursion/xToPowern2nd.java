import java.util.Scanner;
public class xToPowern2nd {
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        // 1. Time Complexity - O(n)
        // int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

                    // OR

        // 2. Time Complexity - O(log n)
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter the power value: ");
        int pow = sc.nextInt();
        System.out.println(base+ "^" +pow+ " is: " + optimizedPower(base, pow));
    }
}