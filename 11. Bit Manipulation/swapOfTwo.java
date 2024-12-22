import java.util.Scanner;

public class swapOfTwo {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Before Swapping: x = "+num1+", y = "+num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After Swapping: x = "+num1+", y = "+num2);
    }
}