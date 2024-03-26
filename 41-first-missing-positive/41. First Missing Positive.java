class Solution {
    public boolean isBinarySearch(int j,int arr[]){
        int start = 0,end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == j){
                return true;
            }
            if(arr[mid] < j){
              start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
    public int firstMissingPositive(int[] nums) {
        int j = 1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(isBinarySearch(j,nums)){
                j++;
            }else{
                
                return j;
            }
        }
        return j;
    }
}