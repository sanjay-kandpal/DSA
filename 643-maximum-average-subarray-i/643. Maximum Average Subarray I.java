class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0; // Initialize i to 0
        int j = 0; // Initialize j to 0
        double maxSum = Integer.MIN_VALUE;
        double sum = 0;

        // Calculate the sum of the first subarray of length k
        for (int x = 0; x < k; x++) {
            sum += nums[x];
        }
        maxSum = sum;
        j = k; // Update j to k

        // Slide the window and update the maximum sum
        while (j < nums.length) {
            sum = sum - nums[i] + nums[j];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }

        return maxSum / k;
    }
}