class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length - 1;
        for(int i = 0 ; i < n-1 ; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicate elements
            }
            int first = i;
            int second = i+ 1;
            int third = n;
            while(second < third){
                int sum = nums[first] + nums[second] + nums[third];
                if(sum < 0){
                    second++;
                }else if(sum > 0){
                    third--;
                }else{
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[first]);
                    triplet.add(nums[second]);
                    triplet.add(nums[third]);
                    results.add(triplet);
                    while(second < third && nums[second+1] == nums[second]){
                        second++; //ignore duplicates
                    }
                    while(second < third && nums[third] == nums[third-1]){
                        third--; //ignore duplicates
                    }
                    second++;
                    third--;
                }
            }
        }    
        return results;
    }
}