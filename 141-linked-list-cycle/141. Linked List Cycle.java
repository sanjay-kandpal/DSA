/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode walker = head;
       ListNode runner = head;
        int pos = 0;
        
        while(runner != null &&  runner.next != null){
            
          walker = walker.next;
          runner = runner.next.next;
          if(runner == walker)
           return true;
        }   
        return false;
    }
}