import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static String decode(String str) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String temp = "", result = "";
        
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            
            // If the character is a digit
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0'; // Use '0' to get the correct integer
                    i++;
                }
                i--; // Decrease i to account for the last non-digit
                integerStack.push(count);
            }
            // If closing bracket ']' is found
            else if (str.charAt(i) == ']') {
                temp = "";
                count = integerStack.pop(); // Get the repeat count

                // Pop from stringStack until '['
                while (!stringStack.isEmpty() && !stringStack.peek().equals("[")) {
                    temp = stringStack.pop() + temp;
                }
                
                // Pop the opening bracket
                if (!stringStack.isEmpty() && stringStack.peek().equals("[")) {
                    stringStack.pop();
                }
                
                // Repeat temp count times and push back to stringStack
                StringBuilder repeatedString = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    repeatedString.append(temp);
                }
                stringStack.push(repeatedString.toString());
            }
            // If opening bracket '[' is found
            else if (str.charAt(i) == '[') {
                stringStack.push("[");
            }
            // If it's a regular character
            else {
                stringStack.push(String.valueOf(str.charAt(i)));
            }
        }
        
        // Collect the final decoded string
        while (!stringStack.isEmpty()) {
            result = stringStack.pop() + result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        System.out.println("After Decoding: " + decode(str));
    }
}
