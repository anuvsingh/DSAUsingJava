import java.util.Scanner;

public class creationof2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of Columns: ");
        int cols = sc.nextInt();
        int matrix [][] = new int [rows][cols];
        // we can also find the length by: rows = matrix.length & cols = matrix[0].length
        System.out.print("Enter Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix [i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix of "+rows+" * "+cols+" is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}