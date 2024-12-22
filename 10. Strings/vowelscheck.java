import java.util.Scanner;

public class vowelscheck {
    
    public static void vowels_checking (String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Count of vowels are: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str;
        System.out.print("Enter any String: ");
        str = sc.nextLine();
        vowels_checking(str);
    }
}