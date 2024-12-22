public class largestNumber {
    
    public static int largest_number(int nums[]) {

        int largest = Integer.MIN_VALUE; // indicates: -infinity
        int smallest = Integer.MAX_VALUE; // indicates: +infinity

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i]; // updating the largest value
            }
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
       int numbers[] =  {-1, 2, 6, 3, 5};
       System.out.println("Largest number is: " + largest_number(numbers));
    }
}