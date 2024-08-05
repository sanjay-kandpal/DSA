class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int index =0 ; index < n;){
            
            if(map.containsKey(arr[index]) && map.get(arr[index]) == 1){
                if(k == 1){
                    return arr[index];
                }
                k--;
            }

            index++;
        }
        return "";
    }
}