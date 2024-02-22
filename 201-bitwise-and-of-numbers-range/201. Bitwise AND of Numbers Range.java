class Solution {
    public int rangeBitwiseAnd(int left, int right) {
     while(right > left)
      right = right & right -1;
      
      return right &left;
      								// 12 ---- 1100
									// 11 ---- 1011
									// 10 ---- 1010
									// 9  ---- 1001
									// 8  ---- 1000
									// 7  ---- 0111
									// 6  ---- 0110
									// 5  ---- 0101
									

    }
}
