import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Initialize with -1 to handle the base case of valid substring at the beginning
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                // Push the index of the opening parenthesis
                stack.push(i);
            } else {
                // Pop the stack for a matching opening parenthesis
                stack.pop();
                
                if (stack.isEmpty()) {
                    // If the stack is empty, push the current index
                    stack.push(i);
                } else {
                    // Calculate the length of the valid substring
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        
        return maxLength;
    }
}
