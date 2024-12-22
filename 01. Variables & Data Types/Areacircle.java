import java.util.Scanner;

public class Areacircle {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.print(area);
    }
}