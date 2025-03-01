public class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        if (n == 0) {
            return "";  // Edge case: empty string
        }
        
        // LPS array to hold the longest prefix length for each position
        int[] lps = new int[n];
        lps[0] = 0;  // no proper prefix for a single character
        
        int i = 0;  // length of the previous longest prefix suffix
        // Loop through the string characters from index 1 to n-1
        for (int j = 1; j < n; j++) {
            // If there's a mismatch, fall back to the length of the previous longest prefix
            while (i > 0 && s.charAt(i) != s.charAt(j)) {
                i = lps[i - 1];  // move `i` to the last known matching prefix length
            }
            // If characters match, extend the current prefix length
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            lps[j] = i;  // record the prefix length for substring ending at j
        }
        
        // The last value of lps[] is the length of the longest prefix that is also a suffix
        int length = lps[n - 1];
        return s.substring(0, length);
    }
}
