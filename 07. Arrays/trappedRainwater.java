import java.util.Scanner;

public class trappedRainwater {
    
    public static int trapped_rainwater (int height[], int width) { // O(n)
        int n = height.length;

        // Calculate left-max-boundary using auxiliary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculate right-max-boundary using auxiliary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // Loop
        for (int i = 0; i < n; i++) {

            // Waterlevel = min (left-max-boundary, right-max-boundary)
           int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped Water = (waterlevel - height[i]) * width
            // width = 1 
           trappedWater += (waterlevel - height[i]) * width;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Width of the Bars: ");
        int width = sc.nextInt();
        System.out.print("Enter no. of Bars: ");
        int size = sc.nextInt();
        int height[] = new int[size];
        System.out.print("Enter Heights: ");
        for (int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("Total Trapped Water is: " + trapped_rainwater(height, width));
    }
}