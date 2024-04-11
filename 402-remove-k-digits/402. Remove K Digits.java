class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        Stack<Character> st = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
                st.pop();
                k--;
            }
            st.push(digit);
        }

        // If there are still digits to remove, remove them from the end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Construct the result string
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        ans.reverse();

        // Remove leading zeros
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.toString();
    }
}
