import java.util.Scanner;

public class hollowrectangle {

    public static void hollow_rectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of Cols: ");
        int cols = sc.nextInt();
        System.out.println("PATTERN is:");
        hollow_rectangle(rows, cols);
    }
}