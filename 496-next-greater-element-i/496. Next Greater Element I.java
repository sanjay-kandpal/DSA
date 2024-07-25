class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 
        int n1 = nums1.length;
        int n2 = nums2.length;
        int result[] = new int[n1];
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums2){
            while(!stack.isEmpty() && num > stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int i = 0;
        for(int num : nums1){
            result[i++] = map.getOrDefault(num,-1);
        }
        return result;
    }
}