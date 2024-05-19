class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> map = new HashMap<>();
      if(s.length() != t.length())
        return false;
      for(int i = 0 ; i <s.length() ; i++){
        char chS = s.charAt(i);
        char chT = t.charAt(i);
        map.put(chS,map.getOrDefault(chS,0)+1);
        map.put(chT,map.getOrDefault(chT,0)-1);
      } 

      for(Integer value : map.values()){
        if(value != 0){
            return false;
        }
      }
      return true;
    }
}