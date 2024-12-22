import java.util.Scanner;

public class break2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        do {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("EXIT! Number is multiple of 10.");
    }
}