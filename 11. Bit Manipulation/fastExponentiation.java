import java.util.Scanner;

public class fastExponentiation {

    public static int fast_expo (int base, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {
                ans = ans * base;
            }
            base = base * base;
            pow = pow >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int base = sc.nextInt();
        System.out.print("Enter the Power: ");
        int pow = sc.nextInt();
        System.out.println("Exponentiation: " + fast_expo(base, pow));
    }
}