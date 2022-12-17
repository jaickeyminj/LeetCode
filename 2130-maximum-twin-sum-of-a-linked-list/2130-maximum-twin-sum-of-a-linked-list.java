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
    public int pairSum(ListNode head) {
        int max= Integer.MIN_VALUE;
        ListNode slow,fast;
        slow = head;
        fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;
        fast = head;
        while(slow!=null){
            // int sum = slow.val + fast.val;
            max= Math.max(slow.val + fast.val,max);
            slow= slow.next;
            fast = fast.next;
        }
        return max;
    }
    public ListNode reverse(ListNode head) {
        ListNode next,pre;
        pre = null;
        next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}