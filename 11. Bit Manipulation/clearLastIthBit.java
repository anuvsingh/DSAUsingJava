import java.util.Scanner;

public class clearLastIthBit {

    public static int clear_last_ith_bit (int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter value of i: ");
        int i = sc.nextInt();
        System.out.println("After clearing last ith bit: " + clear_last_ith_bit(num, i));
    }
}