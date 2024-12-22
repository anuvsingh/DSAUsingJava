import java.util.Scanner;

public class countSetBits {
    
    public static int count_set_bits (int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {  // Check LSB
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println("Set bit in a " + num + " is: " + count_set_bits(num));
    }
}