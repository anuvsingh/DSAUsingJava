import java.util.Scanner;

public class hollowrhombus {

    public static void hollow_rhombus(int totrows) {

        // Spaces
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totrows - i; j++) {
                System.out.print("  ");
            }
            // Hollow Rectangle
            for (int j = 1; j <= totrows; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totrows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Hollow Rhombus:");
        hollow_rhombus(rows);
    }
}