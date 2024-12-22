import java.util.Scanner;

public class singleLetters {

    public static void print_letters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ", ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any String: ");
        String str = sc.nextLine();
        System.out.println("String is: " + str);
        System.out.println("Characters of String are: ");
        print_letters(str);
    }
}