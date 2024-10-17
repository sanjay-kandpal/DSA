class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count the occurrences using an array instead of a HashMap
        int[] count = new int[2001]; // Array to store counts of numbers from -1000 to 1000
        for (int num : arr) {
            count[num + 1000]++;  // Shift index by 1000 to handle negative numbers
        }

        // Step 2: Track unique frequencies using a boolean array
        boolean[] seen = new boolean[arr.length + 1];  // To track if a frequency has been seen before

        // Step 3: Iterate over the count array to check for unique occurrences
        for (int freq : count) {
            if (freq > 0) {  // If a number has non-zero occurrences
                if (seen[freq]) {
                    return false;  // Frequency is already seen, return false
                }
                seen[freq] = true;  // Mark the frequency as seen
            }
        }

        return true;  // All frequencies are unique
    }
}
