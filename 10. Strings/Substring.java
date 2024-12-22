import java.util.Scanner;

public class Substring {
    
    public static String sub_string (String str, int si, int ei) {
        String substr = "";
        for (int i = si; i <= ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any String: ");
        String str = sc.nextLine();
        System.out.print("Enter Starting Index: ");
        int si = sc.nextInt();
        System.out.print("Enter Ending Index: ");
        int ei = sc.nextInt();
        System.out.println("Subtring is: " + sub_string(str, si, ei));
    }
}