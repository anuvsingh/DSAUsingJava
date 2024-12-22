import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Year: ");
        long year = sc.nextLong();
        if (year % 4 == 0)
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("NOT LEAP YEAR");
        }
    }
}