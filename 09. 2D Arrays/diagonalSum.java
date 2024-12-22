import java.util.Scanner;

public class diagonalSum {
    
    public static int diagonal_sum(int matrix[][]) {
        int sum = 0;
        /*  TIME COMPLEXITY: O(n^2)
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
                else if (i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        */
        // TIME COMPLEXITY: O(n)
        for (int i=0; i<matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter no. of Columns: ");
        int cols = sc.nextInt();
        int matrix [][] = new int [row][cols];
        System.out.println("Enter Elements: ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Diagonal Sum is: " + diagonal_sum(matrix));
    }
}