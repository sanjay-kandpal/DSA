class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int l = 1,r= 1;
        int ans = nums[0];

        for(int i = 0 ; i < n ; i++){
            // IF any of l or become 0 then update it to 1
            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;

            l *= (double)nums[i]; //prefix product
            r *= (double)nums[n-1-i];

            ans = Math.max(ans,Math.max(l,r));

        }
        return ans;
    }
}