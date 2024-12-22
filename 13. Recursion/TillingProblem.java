import java.util.Scanner;

public class TillingProblem {
    public static int tillingProblem(int n) { // 2 * n

        // BASE CASE
        if (n == 0 || n == 1) {
            return 1;
        }
        // VERTICAL CHOICE
        int fnm1 = tillingProblem(n-1);
        // HORIZONTAL CHOICE
        int fnm2 = tillingProblem(n-2);
        
        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Total ways of Tilling: " +tillingProblem(n));
    }
}
