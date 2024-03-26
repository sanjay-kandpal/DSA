class Solution {
    // public static int recurnF(int m,int n,int memo[][]){
    //     if( m == 0 &&  n== 0){
    //         return 1;
    //     }
    //     if(m < 0 || n < 0){
    //         return 0;
    //     }
    //     if(memo[m][n] != -1){
    //         return memo[m][n];
    //     }
    //     int up = recurnF(m-1,n,memo);
    //     int down = recurnF(m,n-1,memo);
    //     return memo[m][n] = up+down;
    // }
    public int uniquePaths(int m, int n) {
    //     int memo[][] = new int[m][n];
    //     for(int i = 0 ; i < m ;i++){
    //         for(int j = 0 ; j < n;j++){
    //             memo[i][j] = -1;
    //         }
    //     }
    //   return recurnF(m-1,n-1,memo);   
    int dp[][] = new int[m][n];
    for(int i = 0 ; i < m;i++){
        for(int j = 0 ; j < n ;j++){
            if(i == 0 && j== 0){
                dp[0][0] = 1;
            }else{
                int up = 0,down = 0;
                if(i > 0){
                    up = dp[i-1][j];
                }
                if(j > 0){
                    down = dp[i][j-1];
                }
                dp[i][j] = up+down;
            }

        }
    }
    return dp[m-1][n-1];
    }
}