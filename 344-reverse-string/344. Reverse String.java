class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int initial = 0;
        int end = n-1;

        for(int i  = 0 ; i < n/2 || i < end; i++){
            char temp = s[i];
            s[i] = s[end];
            s[end] = temp;
            end--;
        }   
    }
}