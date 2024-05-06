import java.util.Arrays;

class Solution {
    public boolean check(int[] nums) {
        // Make a copy of the original array
        int[] copy = Arrays.copyOf(nums, nums.length);

        // Sort the copy in non-decreasing order
        Arrays.sort(copy);

        // Concatenate the original array with itself to handle rotations
        int[] concatenatedArr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            concatenatedArr[i] = concatenatedArr[i + nums.length] = nums[i];
        }

        // Check if the sorted copy is included in the concatenated array
        for (int i = 0; i <= concatenatedArr.length - copy.length; i++) {
            boolean found = true;
            for (int j = 0; j < copy.length; j++) {
                if (copy[j] != concatenatedArr[i + j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }

        return false;
    }
}