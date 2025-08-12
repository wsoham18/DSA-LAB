public class Solution {
public int removeDuplicates(int[] nums) {
if (nums.length == 0) return 0;
int index = 1;
for(int i = 1; i < nums.length; i++) {
if(nums[i] != nums[i - 1]) {
 nums[index++] = nums[i];
 }
 }
return index;
    }
public static void main(String[] args) {
Solution sol = new Solution();
int[] nums = {1, 1, 2, 2, 3};
int length = sol.removeDuplicates(nums);
System.out.print("Unique elements: ");
for(int i = 0; i < length; i++) {
 System.out.print(nums[i] + " ");
 }
    }
}
