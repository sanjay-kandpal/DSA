class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left=  new int[n];
        int[] right = new int[n];

        // Calculate left array
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            left[i] = (stack.isEmpty()) ? 0 : stack.peek() + 1;
            stack.push(i);
        }

        // Claer the stack for re-use
        stack.clear();

        // calculate right array
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            right[i] = (stack.isEmpty()) ? n - 1 : stack.peek() - 1;
            stack.push(i);
        }

        // Calculate the maximum area
        int maxArea = 0;
        for(int i = 0 ; i < n ; i++){
            int area = heights[i] * (right[i]-left[i]+1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}