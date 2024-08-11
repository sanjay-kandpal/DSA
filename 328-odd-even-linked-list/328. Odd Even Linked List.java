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
    public ListNode oddEvenList(ListNode head) {
        // Base case: if the list is empty or has only one element, return it as is
        if(head == null || head.next == null){
            return head;
        }

        // 'first' is the pointer for the odd-indexed nodes
        ListNode first = head;
        // 'second' is the pointer for the even-indexed nodes
        ListNode second = head.next;
        // Keep track of the head of the even-indexed nodes
        ListNode evenHead = second;

        // Rearrange nodes to place odd-indexed nodes first and even-indexed nodes second
        while(second != null && second.next != null){
            // Link the current odd node to the next odd node
            first.next = second.next;
            // Move the 'first' pointer to the next odd node
            first = first.next;
            // Link the current even node to the next even node
            second.next = first.next;
            // Move the 'second' pointer to the next even node
            second = second.next;
        }

        // Connect the last odd-indexed node to the head of even-indexed nodes
        first.next = evenHead;
        // Return the head of the rearranged list
        return head;
    }
}
