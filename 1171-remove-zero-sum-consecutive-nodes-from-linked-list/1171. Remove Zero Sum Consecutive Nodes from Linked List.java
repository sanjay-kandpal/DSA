/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode front = new ListNode(0,head);
        ListNode current = front;
        int prefixSum = 0;
        Map<Integer,ListNode> prefixSumToNode = new HashMap<>();
        // Calculate the prefix sum for each node and add to the hashmap
        // Duplicate prefix sum values will be replaced
        while(current != null){
            prefixSum += current.val;
            prefixSumToNode.put(prefixSum,current);
            current = current.next;
        }
        // Reset prefix sum and current
        prefixSum = 0;
        current = front;
        // Delete zero sum consecutive sequences 
        // by setting node before sequence to node after
        while(current != null){
            prefixSum += current.val;
            current.next = prefixSumToNode.get(prefixSum).next ;
            current = current.next;
        }
        return front.next;
        // ListNode front = new ListNode(0,head);
        // ListNode start = front;
        
        // while(start != null){
        //     int prefixSum = 0;
        //     ListNode end = start.next;
        //     while(end != null){
        //         prefixSum += end.val;
        //         if(prefixSum == 0){
        //             start.next = end.next;
        //         }
        //         end = end.next;
        //     }
        //     start = start.next;
        // }
        // return front.next;
    }
}