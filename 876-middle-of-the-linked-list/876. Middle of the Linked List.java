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
    public ListNode middleNode(ListNode head) {
        if(head == null)
        return null;
        ListNode temp = head;
        ListNode ans = head;
        while(temp != null && temp.next != null){
            ans = ans.next;
          temp = temp.next.next;
        } 
        return ans;

    }
}