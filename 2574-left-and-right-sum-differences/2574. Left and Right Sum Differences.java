class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        int ans[] = new int[n];
        leftSum[0] = 0;
        rightSum[n-1]= 0;
        int count = 0;
        for(int i = 1; i < n ;i++){
            leftSum[i] = count + nums[i-1];
            count = leftSum[i]; 
        }
        count = 0;
        for(int i = n-2; i >= 0 ; i--){
            rightSum[i] = count + nums[i+1];
            count = rightSum[i];
        }
        for(int i = 0 ; i < n; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}