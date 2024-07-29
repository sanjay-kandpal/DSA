class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = i + 1; j <= n - 2; j++) {
                if (rating[i] < rating[j]) {
                    // Looking for increasing sequence
                    for (int k = j + 1; k < n; k++) {
                        if (rating[j] < rating[k]) {
                            count++;
                        }
                    }
                } else if (rating[i] > rating[j]) {
                    // Looking for decreasing sequence
                    for (int k = j + 1; k < n; k++) {
                        if (rating[j] > rating[k]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
