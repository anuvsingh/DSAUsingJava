import java.util.Scanner;

public class butterflypattern {

    public static void butterfly(int n) {

        // 1st Half
        for (int i = 1; i <= n; i++) {

            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces = 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd Half
        for (int i = n; i >= 1; i--) {

            // stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces = 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int num = sc.nextInt();
        System.out.println("BUTTERFLY PATTERN is:");
        butterfly(num);
    }
}