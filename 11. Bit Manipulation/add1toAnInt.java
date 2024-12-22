import java.util.Scanner;

public class add1toAnInt {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any Integer: ");
        int num = sc.nextInt();

        // -~num = num + 1;
        System.out.println(num + " + " + 1 + " is: " + -~num);
    }
}