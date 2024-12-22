import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {                    // Time Complexity - O(n)
        int start[] = {1, 3, 0, 5, 8, 5};                       // In this program, we have sorted activities.
        int end[] = {2, 4, 6, 7, 9, 9};
        // End time basis sorted
        int maxAct = 0;
        ArrayList <Integer> ans = new ArrayList<>();
        // First Activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // Activity selection
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activites: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}