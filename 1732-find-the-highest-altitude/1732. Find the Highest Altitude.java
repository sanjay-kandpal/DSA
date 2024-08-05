class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int prefix = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i  < n ; i++){
            prefix += gain[i];
            maxSum = Math.max(prefix,maxSum);
        }
        return maxSum < 0 ? 0 : maxSum ;
    }
}