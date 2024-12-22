import java.util.Scanner;

public class que2 {
    
    public static boolean isEven (int n) {

        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}