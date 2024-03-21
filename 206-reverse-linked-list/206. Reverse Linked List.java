class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // if the list is empty or has only one element, it's already reversed
        }
        
        ListNode temp = head;
        ListNode prev = null;
        
        while (temp != null) {
            ListNode nextNode = temp.next; // Store the next node before changing temp.next
            temp.next = prev; // Reverse the next pointer
            prev = temp; // Move prev to the current node
            temp = nextNode; // Move temp to the next node
        }
        
        return prev; // After the loop, prev will be the new head of the reversed list
    }
}
