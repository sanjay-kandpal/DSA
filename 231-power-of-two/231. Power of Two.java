class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of two
        }

        // Check if only one bit is set in the binary representation of n
        return (n & (n - 1)) == 0;
    }
}
