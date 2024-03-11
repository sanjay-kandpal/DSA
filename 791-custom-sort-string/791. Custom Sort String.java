class Solution {
    public String customSortString(String order, String s) {
    
        Map<Character,Integer> freq = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < order.length(); i++){
            char letter = order.charAt(i);
            while(freq.getOrDefault(letter,0) > 0){
                ans.append(letter);
                freq.put(letter,freq.get(letter)-1);
            }
        }
        for(char letter : freq.keySet()){
            int count = freq.get(letter);
                while(count > 0){
                    ans.append(letter);
                    count--;
                }
            }
        
        return ans.toString();

    }
}