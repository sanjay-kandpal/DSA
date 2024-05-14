class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m+n];
        int k = 0, i = 0, j = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        while(i < m){
            temp[k++] = nums1[i++];
        }

        while(j < n){
            temp[k++] = nums2[j++];
        }

        // Copy the merged elements back into nums1
        for (int l = 0; l < m + n; l++) {
            nums1[l] = temp[l];
        }
    }
}
