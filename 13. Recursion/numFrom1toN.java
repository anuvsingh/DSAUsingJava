import java.util.Scanner;

public class numFrom1toN {
    
    public static void printInc (int n) {
        if (n == 1) {
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        printInc(n);
    }
}