class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true; // An empty string is always a subsequence of any string
        }
        
        int sIndex = 0; // Pointer for s
        int tIndex = 0; // Pointer for t
        
        while (tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++; // Move to the next character in s
                if (sIndex == s.length()) {
                    return true; // All characters in s are found in t in order
                }
            }
            tIndex++; // Always move to the next character in t
        }
        
        return false; // Not all characters in s were found in t
    }
}
