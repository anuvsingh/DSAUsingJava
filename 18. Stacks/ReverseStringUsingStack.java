import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString (String str) {
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder(" ");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        String result = reverseString(str);
        System.out.print("Reversed String: " + result);
    }
}
