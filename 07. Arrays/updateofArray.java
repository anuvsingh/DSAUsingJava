public class updateofArray {
    public static void main(String[] args) {

        // DIRECT ASSIGNMENT
        int nums[] = {1, 2, 3, 4, 5, 6};
        nums[2] = 10;
        System.out.println("Updated array elements:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // USING LOOPS
        int arr[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 3) {
                arr[i] = 0;
            }
        }
        System.out.println("Updated array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}