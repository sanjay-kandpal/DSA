class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxElem=Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            maxElem = Math.max(maxElem,nums[i]);
        }
        int start = 0;
        int end =0;
        int freq = 0;
        long count = 0;
        // Expansion
        while(end < nums.length){
            if(nums[end] == maxElem){
                freq++;
            }
            //Shrinking
            while(freq == k){
                count += nums.length - end;
                if(nums[start] == maxElem){
                    freq--;
                }
                start++;
            }
            end++;
        }
        return count;
    }
}