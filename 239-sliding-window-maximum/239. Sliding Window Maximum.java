class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int ans[] = new int[n-k+1];
        int initial = 0;
        // Store Index
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i  < nums.length ; i++){
            // remove numbers out of range k
            while( !q.isEmpty() && q.peek() < i -k +1){
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if( i >= k - 1){
                ans[initial++] = nums[q.peek()];
            }
        }
        return ans;
    }
}