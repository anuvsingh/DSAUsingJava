import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int arr[], int target){
        Map <Integer, Integer> visited = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            //diff = given target - number given at ith index
            int diff = target - arr[i];
            //check if found difference is present in Map List.
            if (visited.containsKey(diff)) {
                //if difference in map matches with ith index element in array.
                return new int[] {i, visited.get(diff)};
            }
            //add array element in map to match with future element if forms a pair
            visited.put(arr[i], i);
        }
        //if no matches are found
        return new int[] {0, 0};
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);
        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found!");
        }
    }
}