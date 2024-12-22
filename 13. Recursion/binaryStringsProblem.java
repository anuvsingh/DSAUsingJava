import java.util.Scanner;

public class binaryStringsProblem {
    public static void printBinStrings (int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n-1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Places of Binary Number: ");
        int n = sc.nextInt();
        System.out.print("Enter what will be at Last place (0/1): ");
        int lp = sc.nextInt();
        printBinStrings(n, lp, " ");
    }
}