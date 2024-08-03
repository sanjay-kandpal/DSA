class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        boolean[][] visited = new boolean[row][col];
        int answer = 0;
        while(true){
            boolean hasUnMarked = false;
            int maxInIteration = 0;

            // Iterate to each row to find the maximum unmarked cell
            for(int i = 0 ; i < row ; i++){
                int rowMax = 0;
                int  rowMaxIndex = -1;
                for(int j = 0 ; j < col ; j++){
                    if(grid[i][j] > rowMax && visited[i][j] != true){
                        rowMax = grid[i][j];
                        rowMaxIndex = j;
                        hasUnMarked = true;
                    }
                }
                // Mark the maximum cell in the current row
                if (rowMaxIndex != -1) {
                    visited[i][rowMaxIndex] = true;
                    maxInIteration = Math.max(maxInIteration, rowMax);
                }
            }
            // if no unmarked cells are found, break the loop
            if(!hasUnMarked) break;

            // Add the maximum value found in this iteration to the answer
            answer += maxInIteration;
        }
        return answer;
    }
}