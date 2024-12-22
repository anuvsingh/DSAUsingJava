import java.util.Scanner;

public class Nqueens {
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
    public static void printBoard (char board[][]) {
        System.out.println("------Chess Board------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void nQueens (char board[][], int row) {
        // Base Case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for(int j=0; j<board.length; j++) {             // Column Loop
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1);                  // Function Calling
                board[row][j] = 'x';                    // Backtracking
            }
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N (N*N Board): ");
        int n = sc.nextInt();
        System.out.println("N Queens All Possible Solutions are: ");
        char board[][] = new char[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
    }
}