import java.util.Scanner;

public class numbersIntoDigit {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.print(+ num + " in Digits is: ");
        printDigits(num);
        System.out.println();
    }
}