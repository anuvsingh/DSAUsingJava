import java.util.Scanner;

public class product {

    public static int multiplication(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of a: ");
        int num1 = sc.nextInt();
        System.out.print("Enter value of b: ");
        int num2 = sc.nextInt();
        int mul = multiplication(num1, num2);
        System.out.println("Multiplication of a and b: " + mul);
    }
}