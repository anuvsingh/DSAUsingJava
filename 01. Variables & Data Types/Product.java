import java.util.Scanner;

public class Product {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        // Product program (user input)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.print(product);
    }
}
