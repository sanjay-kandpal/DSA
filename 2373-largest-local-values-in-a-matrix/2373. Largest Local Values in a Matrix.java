class Solution {
    private int findMax(int[][]grid,int x,int y){
        int maxElement = 0;
        for(int i = x; i <x +3; i++){
            for(int j =y; j < y+ 3;j++){
                maxElement = Math.max(maxElement,grid[i][j]);
            }
        }
        return maxElement;
    }
    public int[][] largestLocal(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxLocal[][] = new int[row-2][col-2];
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < row-2; i++){
            for(int j = 0; j < col-2; j++){
                maxLocal[i][j] = findMax(grid,i,j);
            }
        }
        return maxLocal;   
    }
}