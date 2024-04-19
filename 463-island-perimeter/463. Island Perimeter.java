class Solution {
//    DFS
    public int ans(int i, int j, int[][] grid, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        
        if (visited[i][j]) {
            return 0;
        }
        
        visited[i][j] = true;
        
        int perimeter = 0;
        perimeter += ans(i - 1, j, grid, visited);
        perimeter += ans(i + 1, j, grid, visited);
        perimeter += ans(i, j - 1, grid, visited);
        perimeter += ans(i, j + 1, grid, visited);
        
        return perimeter;
    }
    
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4; // Assume full perimeter
                    // Check each neighbor, subtract if neighbor is also land
                    if (i > 0 && grid[i - 1][j] == 1) perimeter -= 2;
                    if (j > 0 && grid[i][j - 1] == 1) perimeter -= 2;
                }
            }
        }
        
        return perimeter;
    }
}
