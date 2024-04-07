class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openBrackets = new Stack<>();
        Stack<Integer> astericks = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                openBrackets.push(i);
            }else if(s.charAt(i) == '*'){
                astericks.push(i);   
            }else{
                if(openBrackets.size() >0){
                    openBrackets.pop();
                }else if(astericks.size () > 0){
                    astericks.pop();
                }else{
                    return false;
                }
            }
        }
        while(!openBrackets.isEmpty()){
            if(astericks.isEmpty()){
                return false;
            }
            int openIndex = openBrackets.pop();
            int closeIndex = astericks.pop();
            if(openIndex > closeIndex){
                return false;
            }
        }
        return openBrackets.isEmpty();
       
    }
}