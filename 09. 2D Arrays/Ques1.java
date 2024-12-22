import java.util.Scanner;

public class Ques1 {
    
    public static void count_num (int matrix[][], int num) {
        int row = matrix.length, col = matrix[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == num) {
                    count++;
                }
            }
        }
        System.out.println("No. of times " +num+ " appears in 2D Array is: " +count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
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
        count_num(arr, num);
    }
}