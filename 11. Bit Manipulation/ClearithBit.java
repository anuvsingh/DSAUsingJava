import java.util.Scanner;

public class ClearithBit {
    
    public static int clear_i_bit (int n, int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter value of i: ");
        int i = sc.nextInt();
        System.out.println("Clear ith bit of value is: " + clear_i_bit(num, i));
    }
}