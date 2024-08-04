class Solution {
    private static final int MOD = 1_000_000_007;

    public int rangeSum(int[] nums, int n, int left, int right) {
        // Create an array to store all possible subarrays' sums
        int[] subarraySums = new int[n * (n + 1) / 2];
        int index = 0;

        // Generate all subarray sums
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum = (currentSum + nums[j]) % MOD;
                subarraySums[index++] = currentSum;
            }
        }

        // Sort the subarraySums array
        Arrays.sort(subarraySums);

        // Calculate the sum of elements from left to right
        long result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + subarraySums[i]) % MOD;
        }

        return (int) result;
    }
}