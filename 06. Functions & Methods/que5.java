import java.util.Scanner;

public class que5 {

    public static int isSum (int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits is: " + isSum(n));
    }
}