import java.util.Scanner;

public class firstLtoUppercase {
    
    public static String toUpppercase (String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str;
        System.out.print("Enter String: ");
        str = sc.nextLine();
        System.out.println("Changing First Letter to Uppercase:  " + toUpppercase(str));
        System.out.println();
    }
}