import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (!sToTMap.containsKey(charS) && !tToSMap.containsKey(charT)) {
                sToTMap.put(charS, charT);
                tToSMap.put(charT, charS);
            } else {
                if (sToTMap.getOrDefault(charS, charT) != charT || tToSMap.getOrDefault(charT, charS) != charS) {
                    return false;
                }
            }
        }
        return true;
    }
}
