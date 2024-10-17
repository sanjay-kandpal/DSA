class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      Map<Integer,Integer> map1 = new HashMap<>();
      for(int i = 0 ; i < arr.length ; i++){
          map1.put(arr[i],map1.getOrDefault(arr[i],0)+1);
      }
      Set<Integer> s1 = new HashSet<>();
     
      for(Integer key : map1.keySet()){
          s1.add(map1.get(key));
      }
    //   for(int i = 0 ; i < map1.size();  i++){
    //      s1.add(map1.get(arr[i]));
    //   }
      return s1.size() == map1.size();
    }
}