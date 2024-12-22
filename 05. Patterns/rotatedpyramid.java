import java.util.Scanner;

public class rotatedpyramid {
    
    public static void half_pyramid (int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.println("INVERTED HALF PYRAMID:");
        half_pyramid(rows);
    }
}