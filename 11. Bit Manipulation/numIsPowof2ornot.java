import java.util.Scanner;

public class numIsPowof2ornot {
    
    public static boolean isPowerOfTwo (int num) {
        return (num & (num-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        System.out.println(num + " is Power of 2: " + isPowerOfTwo(num));
    }
}