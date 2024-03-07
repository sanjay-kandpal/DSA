class Solution {
    public int minimumLength(String s) {
        int begin  = 0 ;
        int end = s.length()-1;
        while(begin < end && s.charAt(begin) == s.charAt(end)){
            // for beginning
            char c = s.charAt(begin);
            while(begin <= end && c == s.charAt(begin) ){
                begin++;
            }
            while(begin < end && c == s.charAt(end)){
                end--;
            }
        }
        return end-begin+1;
    }
}