import java.util.ArrayList;

public class ContainerWithMostWater {
                                    // 2 POINTER APPROACH (O(n))
    public static int storeWater(ArrayList<Integer>height) {
        int maxWater=0;
        int lp=0;   // left pointer
        int rp=height.size()-1; // right pointer
        while (lp < rp) {
            // Calculating water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // Updating Pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);  height.add(8);  height.add(6);  height.add(2);  height.add(5);  
        height.add(4);  height.add(8);  height.add(3);  height.add(7);
        System.out.println(storeWater(height));
    }
}