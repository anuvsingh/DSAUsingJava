import java.util.Scanner;

public class Subsets {
    public static void findSubsets (String str, String ans,int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans);                // Time Complexity - O(n*2^n)
            }                                        // Space Complexity - O(n)
            return;
        }
        findSubsets(str, ans + str.charAt(i), i+1); // YES
        findSubsets(str, ans, i+1); // NO
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        System.out.println("Subsets of String are: ");
        findSubsets(str, " ", 0);
    }
}