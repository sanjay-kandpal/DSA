class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Compare middle element with the rightmost element
            if (nums[mid] > nums[right]) {
                // Minimum is in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half including mid
                right = mid;
            }
        }
        
        // When left meets right, we have the minimum element
        return nums[left];
    }
}
