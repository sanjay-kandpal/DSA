class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        
        while( i < s.length()){
            if(s.charAt(i) == ')'){
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();
                for(char ch : sb.toString().toCharArray()){
                    st.push(ch);
                }
                i++;
            }else{
                st.push(s.charAt(i));
                i++;
            }
            
        }
        StringBuilder result = new StringBuilder();
        for(char ch : st){
            result.append(ch);
        }
        return result.toString();
    }
}