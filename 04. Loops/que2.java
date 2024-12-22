import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the Number: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.println("Do you want to continue? Press 1 for YES or 0 for NO.");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}