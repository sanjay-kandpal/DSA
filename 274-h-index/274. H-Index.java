class Solution {
    public int hIndex(int[] citations) {
        // Sort the citations array in descending order
        Arrays.sort(citations);
        int numPapers = citations.length;

        // Iterate through the sorted array and find the h-index
        for (int i = 0; i < numPapers; i++) {
            int currentCitations = citations[i];
            int remainingPapers = numPapers - i;

            if (currentCitations >= remainingPapers) {
                return remainingPapers;
            }
        }

        return 0;
    }
}