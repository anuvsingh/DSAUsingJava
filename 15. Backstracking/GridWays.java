import java.util.Scanner;

public class GridWays {
    public static int gridWays (int i, int j, int n, int m) {           // i = row, j = column, n = no. of rows, m = no. of columns
        // Base Case
        if (i == n-1 && j == m-1) {     // Condition for last cell
            return 1;
        } else if (i == n || j == n) {  // Boundary cross condition
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no. of Columns: ");
        int m = sc.nextInt();
        System.out.print("Total no. of Grid ways to acquire Target: ");
        System.out.println(gridWays(0, 0, n, m));                           // (0, 0) to (n, m)
    } 
}