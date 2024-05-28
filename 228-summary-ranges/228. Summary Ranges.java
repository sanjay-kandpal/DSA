class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n;i++ ){
         while( i < n - 1 && nums[i]+1 == nums[i+1]){
            end++;
            i++;
         } 
         if(start == end){
            list.add(String.valueOf(nums[start]));
         }else{
            list.add(nums[start] + "->" + nums[end]);
         }
         end++;
         start = end;
        }
        return list;
    }
}