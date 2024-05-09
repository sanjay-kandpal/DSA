class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        // Create a max heap using PriorityQueue with a custom compartor
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        // Add all elements to the priority Queue
        for(int h : happiness){
            pq.add(h);
        }
        long totalHappinessSum = 0;
        int turns = 0;
        for(int i = 0 ; i < k ;i++){
            // Add the current highest value to the total hapiness sum and remove it from the max heap
            totalHappinessSum += Math.max(pq.poll() - turns,0);

            // Increment turns for the next Iteration
            turns++;
        }
        return totalHappinessSum;
    }
}