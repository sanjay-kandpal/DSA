class Solution {
    public  int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid+1 element is the minimum
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            
            // Check if mid element is the minimum
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            
            // Decide the search direction
            if (nums[high] > nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        // If the array was not rotated
        return nums[0];
    }

}