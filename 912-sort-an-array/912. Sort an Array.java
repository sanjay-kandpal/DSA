class Solution {
    public void sort(int[] nums,int l,int r){
        if( l < r ){
            int m = (l+r)/2;
            sort(nums,l,m);
            sort(nums,m+1,r);
            merge(nums,l,m,r);
        }
    }
    public void merge(int[] nums,int l,int m,int r){
        int n1 = m - l +1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for(int i = 0 ; i < n1; i++){
            L[i] = nums[l+i];
        }
        for(int j = 0 ; j < n2 ; j++){
            R[j] = nums[m+j+1];
        }

        // Merge the temp arrays
        // Initial indices of first and second subarrays.
        int i = 0,j=0;

        // Initial index of merged subarray array
        int k = l;
        while( i < n1 && j < n2){
            if(L[i] <= R[j]){
                nums[k] = L[i];
                i++;
            }else{
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[], if any
        while(i < n1){
            nums[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[], if any
        while(j < n2){
            nums[k] = R[j];
            j++;
            k++;
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length - 1;
        sort(nums,0,n);
        return nums;   
    }
}