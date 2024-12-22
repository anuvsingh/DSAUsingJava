import java.util.*;
                                // BRUTE FORCE - O(n^2)
public class PairSumIst {
    public static boolean pairSum1 (ArrayList<Integer>list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
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
        // 1, 2, 3, 4, 5, 6
        System.out.print("Enter Target: ");
        int tar = sc.nextInt();
        System.out.println(pairSum1(list, tar));
    }
}