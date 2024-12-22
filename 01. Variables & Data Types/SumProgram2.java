import java.util.Scanner;

public class SumProgram2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        //Sum program (user input)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print(sum);
    }
}
