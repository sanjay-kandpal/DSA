class Solution {
    public String shortestPalindrome(String s) {
        int length = s.length();
        String reverseString = new StringBuilder(s).reverse().toString();

        for(int i = 0; i< length ; i++){
            if(
                s.substring(0,length-i).equals(reverseString.substring(i))
            ){
                return new StringBuilder(reverseString.substring(0,i))
                .append(s)
                .toString();
            }
        }
        return "";
    }
}