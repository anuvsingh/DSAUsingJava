import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // CONDITIONAL STATEMENTS
        // else if 
        int age = sc.nextInt();

        // if ADULT statement is true then after all statements will not be checked and executed.
        if (age >= 18) {
            System.out.println("ADULT");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("TEENAGER");
        }
        else {
            System.out.println("CHILD");
        }
    }
}