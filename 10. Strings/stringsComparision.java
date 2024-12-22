import java.util.Scanner;

public class stringsComparision {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter String s1: ");
        String s1 = new String();
        s1 = sc.nextLine();
        System.out.print("Enter String s2: ");
        String s2 = new String();
        s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Strings are Equal.");
        } else {
            System.out.println("Strings are not Equal");
        }
    }
}