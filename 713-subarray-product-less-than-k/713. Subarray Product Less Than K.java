class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int p1 = 0,p2 =0;
        int count =0;
        while(p1 < nums.length ){
            int MultiSum = 1;
            p2 = p1;
            while(p2 < nums.length){
                
                MultiSum *=  nums[p2]; 
                
                if(MultiSum < k){
                    count++;
                    p2++;
                }else{
                    break;
                }
            }
            p1++;
        }
        return count;
    }
}