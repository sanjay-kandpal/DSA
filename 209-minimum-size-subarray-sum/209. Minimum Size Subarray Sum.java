class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int start = 0, end = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < n) {
            sum += nums[end];

            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }

            end++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}