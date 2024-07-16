class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> ans = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int moreThanThis = (int)Math.ceil(n/3);
        for(int i  = 0 ; i < n ; i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : ans.entrySet()){
            if(entry.getValue() > moreThanThis){
                result.add(entry.getKey());
            }
        }
        return result;

    }
}