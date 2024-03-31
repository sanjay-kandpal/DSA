class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //    List<List<String>> ls = new ArrayList<>();
    //    if(strs.length == 1){
    //        List<String> ans = new ArrayList<>();
    //        ans.add(strs[0]);
    //        ls.add(ans);
    //        return ls;
    //    } 

    //    Map<String,List<String>> mp = new HashMap<>();
       
    //    for(int i = 0 ; i < strs.length ; i++){
    //        String s = strs[i];
    //        char[] charArray = s.toCharArray();
           
    //        Arrays.sort(charArray);

    //        StringBuilder newString = new StringBuilder();
    //        newString.append(charArray);
    //        mp.computeIfAbsent(newString.toString(), k -> new ArrayList<>()).add(s);
    //    }
    //    return new ArrayList<>(mp.values());

    // Try By Yourself
    Map<String,List<String>> map = new HashMap<>();
    for(String words : strs){
        char[] word = words.toCharArray();
        Arrays.sort(word);
        String sortedWord = new String(word);
        if(!map.containsKey(sortedWord)){
           map.put(sortedWord,new ArrayList<>()); 
        }
        map.get(sortedWord).add(words);
    }
    return new ArrayList<>(map.values());
    
    }
}