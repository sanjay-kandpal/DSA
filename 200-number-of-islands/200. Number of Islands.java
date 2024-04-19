class Solution {
    public static void countIslands(char[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || visited[i][j] || grid[i][j] == '0') {
            return ;
        }
        
        visited[i][j] = true;
        
         // Incrementing count when encountering a new island
        
        // Recursively count islands in all four directions
         countIslands(grid, i - 1, j, visited);
         countIslands(grid, i + 1, j, visited);
         countIslands(grid, i, j - 1, visited);
         countIslands(grid, i, j + 1, visited);
        
        
    }
    
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int totalIslands = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    // Count islands starting from this cell
                    totalIslands++;
                    countIslands(grid, i, j, visited);
                }
            }
        }
        
        return totalIslands;
    }
}
