import java.util.Scanner;

public class Ques3 {

    public static void print_matrix (int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    public static void transpose (int matrix[][]) {
        int row = matrix.length, cols = matrix[0].length;
        int transpose_matrix[][] = new int [row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                transpose_matrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose Matrix is: ");
        print_matrix(transpose_matrix);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of Columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        transpose(arr);
    }
}