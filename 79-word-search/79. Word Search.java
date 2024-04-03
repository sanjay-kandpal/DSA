class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int r = 0 ; r < m ; r++){
            for(int c = 0 ; c< n; c++){
                if(word.charAt(0) == board[r][c]){
                    boolean ans = dfs(r,c,word,0,board);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean dfs(int r,int c,String word,int wordIndex,char board[][]){
        // valid Case
        if(word.length() == wordIndex){
            return true;
        }
        int row = board.length;
        int col = board[0].length;
        // Base Case
        if(r < 0 || c < 0 || c >= col || r>=row ){
            return false;
        }
        if(board[r][c] == ' ' || board[r][c] != word.charAt(wordIndex) ){
            return false;
        }
        char ch = board[r][c];
        board[r][c] = ' ';
        if( dfs(r-1,c,word,wordIndex+1,board) ||
            dfs(r,c+1,word,wordIndex+1,board) || 
            dfs(r+1,c,word,wordIndex+1,board) ||
            dfs(r,c-1,word,wordIndex+1,board) )
        return true;

        board[r][c] = ch;
        return false;
 
        

    }
}