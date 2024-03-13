class Solution {
    public int pivotInteger(int n) {
        if(n == 1)
        return n;
        if(n == 2)
        return -1;
        int startSum = 0;
        int backwardSum = 0;

        int i =n-2;
        int k = i;
        while(i > 0){
           startSum = i*(i+1)/2;

           backwardSum = ((n-k+1)*(k+n)/2);
           if(startSum == backwardSum){
            return i;
           }
           i--;
           k--;
        }
        return -1;
    }
}