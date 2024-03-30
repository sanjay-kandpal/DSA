class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0 , j= 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
       
        for(j =0 ; j < nums.length; j++){
            int element =target - nums[j];
            
            if(map.containsKey(element)){
                return new int[]{map.get(element),j};
            }
            map.put(nums[j],j);
        }
        return null;
    }
}