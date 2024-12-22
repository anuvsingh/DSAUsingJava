import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("Number is Positive");
        }
        else {
            System.out.println("Number is Negative");
        }
    }
}