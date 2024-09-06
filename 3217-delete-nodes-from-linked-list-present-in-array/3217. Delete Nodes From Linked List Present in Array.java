class Solution {
    
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        // Create a HashSet for efficient lookup of values in nums
        Set<Integer> valuesToRemove = new HashSet<>();
        for(int num : nums){
            valuesToRemove.add(num);
        }
        
        ListNode dummy = new ListNode(0); // Dummy node to handle head modification
        
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            int data = current.next.val;
            
            if (valuesToRemove.contains(data)) {
                // Remove the node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;  // Return modified head
    }
}
