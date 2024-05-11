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
    static int CalcGcd(int a,int b){
        if(b == 0){
            return a;
        }
        return CalcGcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
        ListNode temp =head.next;
        ListNode newNode = head;
        while(temp != null && newNode.next != null){
            int gcd = CalcGcd(temp.val,newNode.val);
            ListNode gcdNode = new ListNode(gcd);
            newNode.next = gcdNode;
            gcdNode.next = temp;
            newNode = temp;
            temp = temp.next ;
        }
        return head;
    }
}