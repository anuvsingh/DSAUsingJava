import java.util.Scanner;

public class SetithBit {
    
    public static int set_ith_bit (int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter value of i: ");
        int i = sc.nextInt();
        System.out.println("Set ith Bit of the value is: " + set_ith_bit(num, i));
    }
}