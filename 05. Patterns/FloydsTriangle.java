import java.util.Scanner;

public class FloydsTriangle {
    public static void floydTriangle (int rows) {
        int counter = 1; 
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Rows: ");
        int Rows = sc.nextInt();
        System.out.println("Floyd's Traingle is:");
        floydTriangle(Rows);
    }
}