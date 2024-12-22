import java.util.Scanner;

public class HanoiProblem {
    // src-source, helper, dest-destination
    public static void towerOfHanoi (int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as helper
        towerOfHanoi(n-1, src, dest, helper);

        // transfer nth from src to destination
        System.out.println("Transfer disk " +n+ " from " +src+ " to " +dest);

        // transfer n-1 from helper to destination, using source as helper.
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. of Disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "B", "C");
    }
}