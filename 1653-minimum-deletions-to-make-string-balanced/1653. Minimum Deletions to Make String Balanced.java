class Solution {
    public int minimumDeletions(String s) {
     Stack<Character> st = new Stack<>();
     int n = s.length();
     int minCount = 0;
     for(int i = 0 ; i < n; i++ ){
        if(!st.isEmpty() && ((st.peek() == 'b') && (s.charAt(i) == 'a'))){
            minCount++;
            st.pop();
        }else{
            st.push(s.charAt(i));
        }
     }
     return minCount;   
    }
    
}