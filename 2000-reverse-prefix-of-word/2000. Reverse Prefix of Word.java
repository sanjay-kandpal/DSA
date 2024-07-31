class Solution {
    public String reversePrefix(String word, char ch) {
        int position = word.indexOf(ch);
        if(position == -1){
            return word;
        }
        StringBuilder reverseString = new StringBuilder();
        String initial = word.substring(0,position+1);
        for(int i = initial.length()-1; i >= 0 ; i--){
            reverseString.append(initial.charAt(i));
        }
        reverseString.append(word.substring(position+1,word.length()));
        return reverseString.toString();
    }
}