class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder temp = new StringBuilder(a);
        int count = 1;  // Starting with one instance of 'a'
        
        // Append 'a' until 'temp' is at least as long as 'b'
        while (temp.length() < b.length()) {
            temp.append(a);
            count++;
        }
        
        // Check if 'b' is now a substring of 'temp'
        if (temp.indexOf(b) != -1) {
            return count;
        }
        
        // Append one more 'a' and check again
        temp.append(a);
        count++;
        
        if (temp.indexOf(b) != -1) {
            return count;
        }
        
        return -1;
    }
}
