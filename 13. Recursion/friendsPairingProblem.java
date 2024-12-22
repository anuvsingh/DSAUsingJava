import java.util.Scanner;

public class friendsPairingProblem {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // SINGLE
        int fnm1 = friendsPairing(n-1);
        //PAIR
        int fnm2 = friendsPairing(n-2);

        int pairWays = (n-1) * fnm2;
        int totWays = fnm1 + pairWays;
        return totWays;

        // from line no.7 to line no.14 can be also written in one line i.e., 
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of Friends: ");
        int frnds = sc.nextInt();
        System.out.println("Total ways of Coupling " +frnds+ " friends is: " +friendsPairing(frnds));
    }
}