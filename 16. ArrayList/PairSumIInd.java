import java.util.*;
public class PairSumIInd {
    public static boolean pairSum2 (ArrayList<Integer>list, int target) {
        int bp = -1; // Breaking Point
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;    // smallest
        int rp = bp;    // largest
        while (lp != rp) {
            // Case 1
            if (list.get(rp) + list.get(lp) == target) {
                return true;
            }
            // Case 2 & 3
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            } else {
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("Enter no. of elements in the List: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements of List: ");
        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter Target: ");
        int tar = sc.nextInt();
        System.out.print("Output: ");
        System.out.println(pairSum2(list, tar));
    }
}