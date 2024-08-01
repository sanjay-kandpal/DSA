class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            count = 0;
            int j = i;
            while( j <  arr.length && arr[j]%2 == 1){
                count++;
                j++;
            }
            if(count == 3){
                return true;
            }    
        }
        return false;
    }
}