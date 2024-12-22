import java.util.Scanner;

public class oddOrEven {

    public static void odd_even(int num) {
        int bitmask = 1;
        if ((num & bitmask) == 0) {
            System.out.println("It's an Even Number.");
        } else {
            System.out.println("It's an Odd Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        odd_even(num);
    }
}