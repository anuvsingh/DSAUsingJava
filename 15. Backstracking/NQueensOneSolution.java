import java.util.Scanner;

public class NQueensOneSolution {
    public static boolean isSafe (char board[][], int row, int col) {
        // Vertical Up
        for (int i=row-1; i>=0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal Left Up
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal Right Up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueens (char board[][], int row) {
        if (row == board.length) {
            count++;
            return true;
        }
        for (int j=0; j<board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row+1)) {
                    return true;
                }
                board[row][j] = 'x';
            }
        }
        return false;
    }
    public static void printBoard (char board[][]) {
        System.out.println("------Chess Board------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of N (N*N Board): ");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Solution is Possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not Possible");
        }
    }
}