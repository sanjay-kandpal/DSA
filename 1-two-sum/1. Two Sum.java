class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    // Try Yourself
    int x = 0; 
    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0 ; i < nums.length ; i++){
        if(map.containsKey(target-nums[i])){
          return new int[]{map.get(target-nums[i]),i};
        }
        map.put(nums[i],i);
    }
    return null;









        
        
        // int i = 0 , j= 0 ;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int count = 0;
        
       
        // for(j =0 ; j < nums.length; j++){
        //     int element =target - nums[j];
            
        //     if(map.containsKey(element)){
        //         return new int[]{map.get(element),j};
        //     }
        //     map.put(nums[j],j);
        // }
        // return null;
    }
}