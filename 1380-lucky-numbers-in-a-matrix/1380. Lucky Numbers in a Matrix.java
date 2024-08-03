import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            int minRow = matrix[i][0];
            int minColIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    minColIndex = j;
                }
            }
            
            boolean isLucky = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][minColIndex] > minRow) {
                    isLucky = false;
                    break;
                }
            }
            
            if (isLucky) {
                ans.add(minRow);
            }
        }
        
        return ans;
    }
}
