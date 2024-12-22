import java.util.Scanner;

public class Typecasting {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        // Type Casting
        float a = 25.12f;
        // int b = a;
        //There is loss of data i.e. .12
        int b = (int) a;
        System.out.println(b);

        //Conversion between char and int
        char ch = 'a';
        int number = ch;
        //It will give ASCII value of the a.
        System.out.println(number);
    }
}
