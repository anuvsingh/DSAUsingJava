import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num1 - ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 - ");
        int num2 = sc.nextInt();
        // If we write only sc.next() then we can only input String, so to write the chararcter we use charAt.
        System.out.println("Enter Operator - "); 
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Addition: ");
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println("Subtraction: ");
                System.out.println(num1 - num2);    
                break;
            case '*':
                System.out.println("Multiplication: ");
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println("Division: ");
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println("Modulos: ");
                System.out.println(num1 % num2);
                break;
        
            default: System.out.println("ERROR");
                break;
        }
    }
}