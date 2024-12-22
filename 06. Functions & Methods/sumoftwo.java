import java.util.Scanner;

public class sumoftwo {
    // int num1, int num2 are parameters or formal parameters 
    public static int calculatesum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        // (a, b) a and b are arguments or actual parameters 
        int sum = calculatesum(a, b);
        System.out.println("Sum is: " + sum);
    }
}