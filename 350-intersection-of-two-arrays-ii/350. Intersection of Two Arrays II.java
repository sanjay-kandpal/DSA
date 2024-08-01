import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j = 0, k = 0;
        
        int[] temp = new int[Math.min(n1, n2)];
        
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                temp[k++] = nums1[i];
                i++;
                j++;
            }
        }
        
        return Arrays.copyOfRange(temp, 0, k);
    }
}
