import java.util.Scanner;

public class ifelse {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        // CONDITIONAL STATEMENTS
        // if - else 
        int age = sc.nextInt();
        if (age >= 5 && age < 18) {
            System.out.println("You're a Boy.");
        }
        if (age >= 18 && age < 21) {
            System.out.println("You're an Adult");
        }
        else {
            System.out.println("You're a Teenager.");
        }
    }
}