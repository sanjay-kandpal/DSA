class Solution {
    public boolean samesign(int x,int y){
        if(x < 0 && y <0)
            return true;
        else if(x > 0 && y > 0)
            return true;
        return false;
    }
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i = 0 ; i < n; i++){
            if(st.size() == 0 || (st.peek() < 0 && asteroids[i] > 0) || samesign(st.peek(),asteroids[i])){
                st.push(asteroids[i]);
            }else{
                while(st.size() > 0 && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }
                if(st.size() == 0 || st.peek() < 0){
                    st.push(asteroids[i]);
                }else if(st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }

            }
            
        }
        int[] ans = new int[st.size()];
        int i = st.size() - 1;
        while(!st.isEmpty()){
            ans[i] = st.peek();
            i--;
            st.pop();
        }
        return ans;
    }
}