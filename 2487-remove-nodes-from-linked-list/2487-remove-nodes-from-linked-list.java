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
    public ListNode removeNodes(ListNode head) {
        ListNode tail = reverse(head), cur = tail;
        int mx = cur.val;
        while (cur.next != null) {
            if (cur.next.val < mx) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
                mx = cur.val;
            }
        }
        return reverse(tail);
    }
    private ListNode reverse(ListNode n) {
        ListNode tail = null;
        while (n != null) {
            ListNode next = n.next;
            n.next = tail;
            tail = n;
            n = next;
        }
        return tail;
    }
}