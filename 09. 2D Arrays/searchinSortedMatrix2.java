import java.util.Scanner;

public class searchinSortedMatrix2 {
    
    public static boolean staircase_search(int matrix[][], int key) {
        int row = matrix.length-1, col = 0;
        while (row >= 0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.print("Found Key at (" + row + ", " + col + ")");
                return true;
            }
            else if (key < matrix[row][col]) {
                row--;
            }
            else {
                col++;
            }
        }
        System.out.println("Key not Found !!!");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter key to be search: ");
        int key = sc.nextInt();
        System.out.print("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of Columns: ");
        int cols = sc.nextInt();
        int matrix[][] = new int [rows][cols];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        staircase_search(matrix, key);
    }
}