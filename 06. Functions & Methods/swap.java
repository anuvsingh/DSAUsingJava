import java.util.Scanner;

public class swap {

    public static void swapping(int a, int b) {
        //swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: ");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt(); 
        swapping(a, b);

        // we cannot print output in the main() becoz whatever we change inside the user defined function it is only changed in this function only if we come out or go to main function value remains in it actual value that is also called CALL BY VALUE     
    }
}
