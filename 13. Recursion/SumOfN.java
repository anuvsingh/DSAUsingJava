import java.util.Scanner;

public class SumOfN {
    
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = sum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}