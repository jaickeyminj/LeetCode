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
        ListNode a,b;
        a= head;
        b = head;
        
        while(a != null && a.next != null){
            a = a.next;
            a= a.next;
            b = b.next;
        }
        
        return b;
    }
}