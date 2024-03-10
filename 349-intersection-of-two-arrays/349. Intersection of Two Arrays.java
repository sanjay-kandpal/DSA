class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> intersection = new HashSet<>();
        int i = 0, j= 0;
        while( i < nums1.length && j < nums2.length ){
            if(nums1[i] == nums2[j]){
                
                intersection.add(nums2[j]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int length = intersection.size();
        int count = 0;
        int result[] = new int[length];
        for(int x : intersection){
          result[count++] = x;
        }
        return result;
    }
}