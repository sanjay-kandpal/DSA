class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0 ;
        
        while( i < s.length()){
            if(!st.isEmpty() && st.peek() == '(' && s.charAt(i) == ')'){
                st.pop();
            }else{
            st.push(s.charAt(i));
            }
            i++;
        }
        return st.size();
    }
}