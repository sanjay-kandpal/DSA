import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums); // Sort the array first
        int count = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int newVal = nums[i - 1] + 1;
                count += newVal - nums[i];
                nums[i] = newVal;
            }
        }
        
        return count;
    }
}
