class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] freqCount = new int[n+1];

        // Count the number of trusts for each person
        for (int i = 0; i < trust.length; i++) {
            freqCount[trust[i][1]]++;
        }

        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;

        // Find the person with maximum trusts
        for (int i = 1; i <= n; i++) {
            if (freqCount[i] > maxValue) {
                maxValue = freqCount[i];
                maxIndex = i;
            }
        }

        // Check if the potential judge is also a trustee
        for (int i = 0; i < trust.length; i++) {
            if (trust[i][0] == maxIndex) {
                return -1;
            }
        }

        return maxValue == n - 1 ? maxIndex : -1;
    }
}
