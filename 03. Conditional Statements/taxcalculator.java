import java.util.Scanner;

public class taxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int income = sc.nextInt();
        double tax;

        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {
            tax = income * 0.2;
        }
        else {
            tax = income * 0.3;
        }
        System.out.println("Your tax is : " + tax);
    }
}