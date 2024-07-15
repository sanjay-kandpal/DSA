class Solution {
    public int maxSubArray(int[] nums) {
    // Kedane's Algorithm
    //    int max = Integer.MIN_VALUE;
    //    int sum =0;
    //    for(int i = 0 ; i < nums.length ; i++){
    //         sum += nums[i];
    //         max = Math.max(max,sum);
    //         if(sum < 0){
    //             sum = 0;
    //         } 
    //    } 
    //    return max;

    // Divide and conqueror
    return helper(nums,0,nums.length-1);
    
    }
    public static int helper(int[] nums,int i,int n){
        if(i == n){
            return nums[i];
        }

        int mid = (i+n)/2;
        int sum = 0,leftMaxSum = Integer.MIN_VALUE;

        for(int l = mid ; l >= i; l--){
            sum += nums[l];
            if(sum > leftMaxSum ){
                leftMaxSum = sum;
            }
        }

        int rightMaxSum = Integer.MIN_VALUE;
        sum = 0;
        for(int l = mid + 1 ; l <= n ;l++){
            sum += nums[l];
            if(sum > rightMaxSum){
                rightMaxSum = sum;
            }
        }
        int maxLeftRight = Math.max(helper(nums,i,mid),helper(nums,mid+1,n));
        return Math.max(maxLeftRight,rightMaxSum + leftMaxSum);

    }
}