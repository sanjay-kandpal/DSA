class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int min = Integer.MAX_VALUE; // Initialize to a very high value
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i]; // Update min if current price is lower
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min); // Calculate max profit
            }
        }

        return maxProfit;
    }
}
