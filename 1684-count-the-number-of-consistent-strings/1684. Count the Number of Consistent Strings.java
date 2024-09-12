class Solution {
    protected boolean isPresent(String word,String allowed){
        int n1 = word.length();
        int n2 = allowed.length();

        int i = 0,j=1 ;
        
        while( i < n1){
        
           if(allowed.indexOf(word.substring(i,j)) == -1){
            return false;
           } 
           i++;
           j++;
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
      int n = words.length;
      int ans = 0;
      for(String word : words){
        if(isPresent(word,allowed)){
            ans++;
        }
      }  
      return ans;
    }
}