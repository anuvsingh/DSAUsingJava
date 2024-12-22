import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " & " + str2 + " are Anagrams of eachother.");
            } else {
                System.out.println(str1 + " & " + str2 + " are not Anagrams.");
            }
        }
    }
}