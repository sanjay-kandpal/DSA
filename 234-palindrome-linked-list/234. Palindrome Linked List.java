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
    public boolean isPalindrome(ListNode head) {
        StringBuilder str = new StringBuilder();
        while(head != null){
            str.append(head.val);
            head = head.next;
        }
        str.toString();
        int p = 0;
        int last = str.length()-1;
        while( p <= last){
            if(str.charAt(p) != str.charAt(last)){
                return false;
            }else{
                p++;
                last--;
            }
        }
        return true;
    }
}