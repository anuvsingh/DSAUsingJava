import java.util.Scanner;

public class clearRangeBits {
    
    public static int clear_range_bits (int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter range i: ");
        int i = sc.nextInt();
        System.out.print("Enter range j: ");
        int j = sc.nextInt();
        System.out.println("After clearing bits in range: " + clear_range_bits(num, i, j));
    }
}