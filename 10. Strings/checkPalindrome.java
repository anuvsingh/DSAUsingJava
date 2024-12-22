import java.util.Scanner;

public class checkPalindrome {
    
    public static boolean isPalindrome (String str) {
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any String: ");
        String str = sc.nextLine();
        System.out.print("Checking Palindrome (true/false): " + isPalindrome(str));
    }
}