class Solution {
    public int majorityElement(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            int k = nums[i];
            int j = i -1;

            while(j >= 0 && nums[j] < k ){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = k;
        }
        int mid = (nums.length)/2;
        return nums[mid];
    }
}