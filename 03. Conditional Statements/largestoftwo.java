import java.util.Scanner;

public class largestoftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is greater than b");
        }
        if (a == b) {
            System.out.println("a & b are equal.");
        }
        else {
            System.out.println("b is greater than a");
        }
    }
}