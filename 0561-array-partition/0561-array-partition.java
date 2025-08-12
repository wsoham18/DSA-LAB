import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int sum = 0;
        
        // Step 2: Add every second element (i.e., the smaller of each pair)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }
}
