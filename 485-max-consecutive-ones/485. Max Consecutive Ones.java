class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int count = 0;
      int max =Integer.MIN_VALUE;
      for(int i =0 ; i < nums.length ; i++){
        if(nums[i] == 0){
            max = Math.max(count,max);
            count = 0;
            continue;
        }
        ++count;
      }  

      return max = Math.max(max,count);
    }
}