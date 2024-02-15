class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long prevElementsSum = 0;
        long ans = -1;
        for(int num : nums){
            if(num < prevElementsSum){
                ans = num + prevElementsSum;
            }
            prevElementsSum += num;
        }
        return ans;
    }
}