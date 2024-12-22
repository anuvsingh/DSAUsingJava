import java.util.Scanner;

public class binaryOperators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        // Binary Operators
        System.out.println("Binary AND: " + (num1 & num2));
        System.out.println("Binary OR: " + (num1 | num2));
        System.out.println("Binary XOR: " + (num1 ^ num2));
        System.out.println("Binary One's Complement: " + (~num2));
        System.out.println("Binary left shift: " + (num1 << num2));
        System.out.println("Binary right shift: " + (num1 >> num2));
    }
}