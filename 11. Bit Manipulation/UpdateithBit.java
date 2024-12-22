import java.util.Scanner;

public class UpdateithBit {

    public static int clear_ith_bit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static int set_ith_bit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static int update_ith_bit (int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clear_ith_bit(n, i);
        // } else {
        //     return set_ith_bit(n, i);
        // }

        n = clear_ith_bit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter value of i: ");
        int i = sc.nextInt();
        System.out.print("Enter newBit (0/1): ");
        int newBit = sc.nextInt();
        System.out.println("Updated ith bit of value is: " + update_ith_bit(num, i, newBit));
    }
}