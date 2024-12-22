import java.util.Scanner;

public class KeypadCombinations {

    public static void bfs (int pos, int len, StringBuilder sb, String D) {
        if (pos == len) {
            System.out.print(sb.toString()+ ", ");
        } else {
            char[] letters = L [Character.getNumericValue(D.charAt(pos))];
            for (int i = 0; i < letters.length; i++) {
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), D);
            }
        }
    }
    final static char[][] L = { {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, 
                                {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, 
                                {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'} };
    public static void letterCombinations (String D) {
        int len = D.length();
        if (len == 0) {
            System.out.print(" ");
            return;
        }
        bfs(0, len, new StringBuilder(), D);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        // System.out.print("Enter Digits: ");
        // String digit = sc.next();
        // System.out.print("Letters Combinations are: ");
        letterCombinations("23");
    }
}