import java.util.*;
public class MostFrequentNumber {
    public static int mostFrequent (ArrayList<Integer>nums, int key) {
        int[] result = new int[1000];
        for (int i = 0; i < nums.size()-1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i+1)-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("Enter no. of Elements in List: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements: ");
        for (int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter Key: ");
        int key = sc.nextInt();
        System.out.print("Most Frequent Number Following Key is: ");
        System.out.println(mostFrequent(list, key));
    }
}