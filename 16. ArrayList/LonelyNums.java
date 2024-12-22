import java.util.*;
public class LonelyNums {
    public static ArrayList<Integer>findLonely (ArrayList<Integer>nums) {
        Collections.sort(nums);
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 1; i < nums.size()-1; i++) {
            if (nums.get(i-1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i+1)) {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size()-2) + 1 < nums.get(nums.size()-1)) {
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("Enter no. of Elements in List: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Lonely Elements in ArrayList: ");
        System.out.println(findLonely(list));
    }
}