class Solution {
    public void moveZeroes(int[] nums) {
        int j = nums.length;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                int k = i;
                while( k < j){
                    if(nums[k] != 0){
                        int elem = nums[k];
                        nums[k] = temp;
                        nums[i] = elem;
                        break;
                    }
                    k++;
                }
            }
        }
    }
}