class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // BruteForce Solution:
        // int p1 = 0,p2 =0;
        // int count =0;
        // while(p1 < nums.length ){
        //     int MultiSum = 1;
        //     p2 = p1;
        //     while(p2 < nums.length){
        //         if(p1 == p2){
        //             MultiSum = nums[p1];
        //         }else{
        //             MultiSum *= nums[p2]; 
        //         }
        //         if(MultiSum < k){
        //             count++;
        //             p2++;
        //         }else{
        //             break;
        //         }
        //     }
        //     p1++;
        // }
        // return count;
        // Optimised Solution:
        if( k < 1) return 0;
        int start = 0,end = 0,product = 1,subcount = 0;
        while(start < nums.length && end < nums.length){
            product *= nums[end];
            
                while(product >= k && start <= end){
                    product /= (nums[start]);
                    start++;
                } 
            
            subcount += end -start +1;
                end++;
        }
        return subcount;

    }
}