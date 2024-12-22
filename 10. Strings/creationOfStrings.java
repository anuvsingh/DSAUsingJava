import java.util.Scanner;

public class creationOfStrings {
    
    public static void main(String[] args) {

        // Declaration / Intialization of a String.
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "Anubhav";
        String str2 = new String("singh");

        // STRINGS ARE IMMUTABLE

        // Input / Output of a String.
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Input: ");
        name = sc.nextLine(); // WHOLE LINE
        // name = sc.next();  // ONLY A WORD
        System.out.print("Output: " +name);
    }
} 