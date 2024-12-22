import java.util.Scanner;

public class Permutations {
    public static void findPermutation (String str, String ans) {
        // BASE CASE 
        if (str.length() == 0) {
            System.out.println(ans);
            return;                                           // Time Complexity - O(n*n!)
        }
        // RECURSION
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(NewStr, ans + curr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        System.out.println("Permutations of String are: ");
        findPermutation(str, " ");
    }
}