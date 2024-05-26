class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int start = 0; // Correct initialization
        int end = n - 1; // Correct initialization
        while (start < end) {
            int width = end - start;
            int minHeight = Math.min(height[start], height[end]);
            max = Math.max(max, minHeight * width); // Correct max area calculation
            
            // Move the pointers
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
