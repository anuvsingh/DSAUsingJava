import java.util.Scanner;

public class reverseofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev*10) + lastdigit;
            n /= 10;
        }
        System.out.print("Afer Reversing: ");
        System.out.println(rev);
    }
}