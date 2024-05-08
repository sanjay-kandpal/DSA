class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j = 1,count = 1;
        int initial = nums[0];
        for(int i = 1 ;i < nums.length && j < nums.length; i++){
            if(initial != nums[i]){
                count++;
                nums[j] = nums[i];
                initial = nums[i];
                j++;
            }
        }
        return count;

        
    }
}