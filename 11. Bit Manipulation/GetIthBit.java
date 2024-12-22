import java.util.Scanner;

public class GetIthBit {
    
    public static int get_ith_bit (int n, int i) {
        int bitmask = 1 << i;
        if (((n & bitmask) == 0)) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter ith value: ");
        int i = sc.nextInt();
        System.out.println(i + " bit of " + num + " is: " + get_ith_bit(num, i));
    }
}