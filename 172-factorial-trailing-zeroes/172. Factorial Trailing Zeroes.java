class Solution {
    public int trailingZeroes(int n) {
        // Instead of computing the factorial directly, which can cause integer overflow,
        // we can count the number of factors of 5 in the factorials.
        // This is because the number of trailing zeros in n! is determined by
        // the number of factors of 5 (since every factor of 10 = 2 * 5 contributes a trailing zero).

        int count = 0;
        while (n >= 5) {
            // Divide n by 5 and add the quotient to the count
            // This way, we count the number of factors of 5 in n!
            n /= 5;
            count += n;
        }
        return count;
    }
}