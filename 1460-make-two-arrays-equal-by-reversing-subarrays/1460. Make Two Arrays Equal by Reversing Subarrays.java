class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int n = arr.length;
        
        Arrays.sort(target);
        Arrays.sort(arr);
        
        for(int i= 0;i < n ; i++){
            if(arr[i] != target[i]){
                return false;
            }
        }
        return true;
    }
}