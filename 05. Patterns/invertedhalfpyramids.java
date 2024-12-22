import java.util.Scanner;

public class invertedhalfpyramids {
    
    public static void half_num_pyramids (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Inverted Half Pyramid is: ");
        half_num_pyramids(rows);
    }
}