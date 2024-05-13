class Solution {
    public int search(int[] nums, int target) {
        int low = 0,hi = nums.length-1;

        while(low < hi ){
            int mid = (low + hi)/2;
            if(nums[mid] > nums[hi]) low = mid + 1;
            else 
            hi = mid;
        }
        int ro = low;
        low = 0; hi = nums.length-1;
        while(low <= hi){
            int mid = (low + hi)/2;
            int realmid = (mid + ro)%nums.length;
            if(nums[realmid] == target) return realmid;
            if(nums[realmid] < target) low = mid + 1;
            else
            hi = mid -1;
        }
        return -1;
    }
}
