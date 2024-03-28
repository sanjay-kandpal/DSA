class Solution {
    public static int recurMin(int m, int n, int grid[][],int memo[][]) {
        if (m == 0 && n == 0) {
            return grid[m][n];
        }
        if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        if(memo[m][n] != -1){
            return memo[m][n];
        }
        int up = recurMin(m - 1, n, grid,memo);
        int left = recurMin(m, n - 1, grid,memo);
        int min = Math.min(up, left); // Calculate the minimum of up and left paths
        return memo[m][n] = min + grid[m][n]; // Add current cell value to the minimum path
    }

    public int minPathSum(int[][] grid) {
        
        int m = grid.length; // Rows
        int n = grid[0].length; // Columns
        int memo[][] = new int[m][n];
        for(int i=0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                memo[i][j] = -1;
            }
        }
        return recurMin(m - 1, n - 1, grid,memo);
    }
}
