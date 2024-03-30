class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int value = 0;
       
        int i=0;
        List<Integer> arr =new ArrayList<>(); 
        if(nums.length == 1){
            
            return arr;
        }
        while(i < nums.length){
            value = Math.abs(nums[i])-1;
            if(nums[value] < 0){
                arr.add(value+1);
                
            }
            nums[value] = -nums[value];
            i++;
        }
      return arr;
    }
}