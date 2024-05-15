class Solution {
    public int removeDuplicates(int[] nums) {
        // Handle the edge case where the array length is less than or equal to 2
        if (nums.length <= 2) {
            return nums.length;
        }
        
        int slow = 2; // Start slow pointer at index 2
        
        // Start fast pointer from index 2
        for (int fast = 2; fast < nums.length; fast++) {
            // If the current element is different from the element two positions before slow
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast]; // Update the element at slow pointer
                slow++; // Move slow pointer forward
            }
        }
        
        // The length of the array with each unique element appearing at most twice
        return slow;
    }
}
