import java.util.Scanner;

public class searchinSortedMatrix1 {
    
    public static boolean staircase_search(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Found Key at (" + row + ", " + col + ")");
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key no Found !!!");
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