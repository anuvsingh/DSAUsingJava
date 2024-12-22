import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // next() ignores the afterspace values or characters
        /* String input = sc.next();
        System.out.println(input);
        */

        // For not ignoring the afterspace value we use nextline()
        /* String name = sc.nextLine();
        System.out.print(name);
        */

        // Input int, we use nextInt()
        int num =  sc.nextInt();
        System.out.print(num);
        
        // Input float, we use nextFloat()
        float price = sc.nextFloat();
        System.out.print(price);
    }
}
