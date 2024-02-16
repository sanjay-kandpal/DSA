class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int freq[] = new int[map.size()];
        int j = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int value = entry.getValue();
            freq[j] = value;
            j++;
        }
        Arrays.sort(freq);
        int ans = 0;

        for(int i = 0 ; i < freq.length ; i++){
            ans+= freq[i];
            if(ans > k){
                return freq.length - i;      
            }
        }
        
        return 0;

    }
}