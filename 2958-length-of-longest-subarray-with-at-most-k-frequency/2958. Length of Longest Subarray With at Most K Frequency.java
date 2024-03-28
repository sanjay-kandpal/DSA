class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
      
      HashMap<Integer,Integer> mp = new HashMap<>();
      int ans = 1;
      
      for(int i = 0,j=0 ; j < nums.length ;++j){
         mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
         while(mp.get(nums[j]) > k){
             mp.put(nums[i], mp.get(nums[i])-1);
             i++;
         }
          ans = Math.max(ans,j-i+1);
        }
       return ans;

    }
}