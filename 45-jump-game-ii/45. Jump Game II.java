class Solution {
    public int jump(int[] nums) {
        int reachable = 0,count = 0,currEnd = 0;
        if(nums.length == 1) return 0;
        for(int i = 0 ; i < nums.length-1; i++  ){
            reachable = Math.max(reachable,i+nums[i]);
            if( i==currEnd){
                count++;
                currEnd = reachable;
            }
        }
        return count;
    }
}