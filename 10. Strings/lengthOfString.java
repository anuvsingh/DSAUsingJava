import java.util.Scanner;

public class lengthOfString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter String: ");
        String name;
        name = sc.nextLine();
        // Counts SPACES also.
        System.out.println("Length of String: " +name.length());
    }
}