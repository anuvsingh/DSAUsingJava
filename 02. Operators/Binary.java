import java.util.Scanner;

public class Binary {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        //Binary Operators
        //Binary is a type of Arithmetic Operators
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a + b;
        System.out.println("Sum = " +add);
        int sub = a - b;
        System.out.println("Subtraction = " +sub);
        int mul = a * b;
        System.out.println("Multiplication = " +mul);
        int div = a / b;
        System.out.println("Division = " +div);
        int mod = a % b;
        System.out.println("Modulo = " +mod);
    }
}