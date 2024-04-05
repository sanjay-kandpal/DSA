class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length() ;i++){
            if( (st.size() > 0)  && (( (Character.isUpperCase(st.peek())) && Character.isLowerCase(s.charAt(i)) ) ||
              (Character.isUpperCase(s.charAt(i))) && (Character.isLowerCase(st.peek()))  )   )
            {
                int num = Math.abs(st.peek() - s.charAt(i));
                if(num == 32){    
                    st.pop();
                    continue;
                }
            
            }
              st.push(s.charAt(i));
        }

        while(st.size() > 0){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}