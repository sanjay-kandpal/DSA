class Solution {
    public static void dfs(ArrayList<ArrayList<Integer>> res,int src,boolean[] visited){
        visited[src] = true;
        for(Integer it: res.get(src)){
            if(!visited[it]){
                dfs(res,it,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> store = storeConnected(isConnected);
        
        boolean[] visited = new boolean[store.size()];
        int ans = 0;
        for(int i  = 0 ; i < visited.length ; i++){
            if(!visited[i]){
                ans++;
                dfs(store,i,visited);
            }
        }
        return ans;

    }
    static ArrayList<ArrayList<Integer>> storeConnected(int[][] isConnected){
        int row = isConnected.length;
        int col = isConnected[0].length;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        
        for(int i = 0 ; i  < row; i++){
            arr.add(new ArrayList<>());
        }

        for(int i = 0 ; i < row;i++){
            for(int j = 0; j < col ; j++){
                if( isConnected[i][j] == 1){
                    arr.get(i).add(j);
                    arr.get(j).add(i);
                }
            }
        }
        return arr;
    }
}