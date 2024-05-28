class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int end = 0; end < n ;end++ ){
            char currentChar = s.charAt(end);
            if(map.containsKey(currentChar)){
                start = Math.max(map.get(currentChar)+1,start);
            }
            max = Math.max(max,end-start+1);
            map.put(currentChar,end);
        }
        return max;
    }
}