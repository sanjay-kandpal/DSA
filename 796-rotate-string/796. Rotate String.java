class Solution {
    public boolean rotateString(String s, String goal) {
        // Check if the lengths of the strings are different
        if (s.length() != goal.length()) {
            return false;
        }
        // Check if goal is a substring of s concatenated with itself
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
