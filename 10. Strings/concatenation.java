import java.util.Scanner;

public class concatenation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Ist String: ");
        String first = sc.nextLine();
        System.out.print("Enter IInd String: ");
        String second = sc.nextLine();
        String concate = first + " " + second;
        System.out.print("String Concatenation: " + concate);
    }
}
