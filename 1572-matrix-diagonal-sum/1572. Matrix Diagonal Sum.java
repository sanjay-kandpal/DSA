class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < col; j++){
                if(i == j){
                    leftDiagonal += mat[i][j];
                }else if(i+j == col-1){
                    rightDiagonal += mat[i][j];
                }
            }
        }
        return leftDiagonal+rightDiagonal;
    }
}