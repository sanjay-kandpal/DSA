class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return false;

        // Find the rotation index
        int rotationIndex = -1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                rotationIndex = i + 1;
                break;
            }
        }
        
        // If the array is not rotated
        if (rotationIndex == -1) {
            rotationIndex = 0;
        }

        // Binary search in the first part
        int k = 0;
        int r = rotationIndex - 1;
        while (k <= r) {
            int mid = (k + r) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < target) {
                k = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        // Binary search in the second part
        k = rotationIndex;
        r = n - 1;
        while (k <= r) {
            int mid = (k + r) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < target) {
                k = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}
