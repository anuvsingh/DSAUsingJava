import java.util.Scanner;
import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicate (String str) {
        Stack <Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // Duplicate
                } else {
                    s.pop(); // Opening pair
                }
            } else {
                s.push(ch); // Opening
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Strings: ");
        String str = sc.next();
        System.out.println("String is Duplicate. " + isDuplicate(str));
    }
}