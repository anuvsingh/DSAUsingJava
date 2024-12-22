public class binarySearch {
    
    public static int binary_search (int nums[], int key) {

        int start = 0;
        int end = nums.length-1; // means n-1

        while (start <= end) {
            int mid = (start + end) / 2;

            if(nums[mid] == key) {  // FOUND
                return mid;
            }

            if (nums[mid] < key) {  // right means 2nd half
                start = mid + 1;
            }
            else {          // left means 1st half
                end = mid-1; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("Key is at index: " + binary_search(numbers, key));
    }
}