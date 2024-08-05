class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int runningSum[] = new int[n];
        Arrays.fill(runningSum,0);
        int prefix = 0;
        for(int i = 0 ; i < n;i++){
            prefix += nums[i];
            runningSum[i] = prefix;
        }
        return runningSum;
    }
}