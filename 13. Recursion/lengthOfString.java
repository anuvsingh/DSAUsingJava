import java.util.Scanner;

public class lengthOfString {
    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        System.out.println("Length of a String is: " +length(str));
        if (length(str) == 7) {
            System.out.println("Thala for a Reason");
        }
    }
}