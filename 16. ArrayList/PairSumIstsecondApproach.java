import java.util.*;
public class PairSumIstsecondApproach {
                                        // 2 pointers approach
    public static boolean pairSum1 (ArrayList<Integer>list, int target) {
        int lp = 0; // left pointer
        int rp = list.size()-1; // right pointer
        while (lp != rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // Case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            // Case 3
            else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // List = [1, 2, 3, 4, 5, 6]
        System.out.print("Enter a Target: ");
        int tar = sc.nextInt();
        System.out.println(pairSum1(list, tar));
    }
}