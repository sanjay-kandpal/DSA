class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans[] = new int[n1];
        
        int k = 0;
        for(int i = 0 ; i < n1; i++){
            int element = nums1[i];
            for(int j = 0; j < n2; j++){
                if( k == n1){
                    break;
                }
                int temp = j;
                if(element == nums2[j]){
                    while(temp < n2  ){
                        if(nums2[temp] > element)
                            break;
                        temp++;
                    }
                    if(temp == n2){
                        ans[k++] = -1;
                    }else{
                        ans[k++] = nums2[temp];
                    }
                }
                
            }
            if( k == n1){
                break;
            }
        }
        return ans;
    }
}