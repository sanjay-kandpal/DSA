class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        // Determine the maximum frequency
        int maxFrequency = 0;
        for(int frequency : map.values()){
            maxFrequency = Math.max(maxFrequency,frequency);
        }
        // Calculate the total frequencies of elements with the maximum frequency
        int frequencyOfMaxFrequency = 0;
        for(int frequency : map.values()){
            if(frequency == maxFrequency){
                frequencyOfMaxFrequency++;
            }
        }
        return frequencyOfMaxFrequency * maxFrequency;
    }
}