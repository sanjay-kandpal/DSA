class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length - 1;
        int i = 0;
        if(nums.length == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[n] > nums[n-1]){
            return n;
        }
        int start = 1;
        int end = n-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            }
            if(nums[mid] < nums[mid-1]){
                end = mid-1;
            }else if(nums[mid] < nums[mid+1]){
                start = mid+1;
            }
        }
        return -1;
    }
}