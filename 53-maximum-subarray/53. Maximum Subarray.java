class Solution {
    public int maxSubArray(int[] nums) {
     
     int n = nums.length;
     int max = kedaneAlgo(nums,n);
     return max;
    }
    private static int kedaneAlgo(int[] nums,int n){
        int maxArraySum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n ;i++){
            sum += nums[i];
            maxArraySum = Math.max(maxArraySum,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxArraySum;
    }

}