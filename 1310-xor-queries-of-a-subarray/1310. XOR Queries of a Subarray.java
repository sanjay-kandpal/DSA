class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n =queries.length;
        int ans[] = new int[n];

        int row = queries.length;
        int col = queries[0].length;

        for(int i = 0 ; i < row; i++){
            int xorSum = 0;
            for(int j = queries[i][0] ; j <= queries[i][1] ; j++){
                xorSum ^= arr[j];
            }
            ans[i] = xorSum;
        }
        return ans;
    }
}