class Solution {
    public int maxDepth(String s) {
        Stack<Character> qt = new Stack<>();
        int count = 0;
        int ans = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '('){
                qt.push(s.charAt(i));
                
                
            }else{
                if(qt.size() > 0 && s.charAt(i) == ')'){
                    ans = Math.max(ans,qt.size());
                qt.pop();
                }
              
            }
        }
        return ans;
    }
}