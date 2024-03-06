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
       if(head == null) return false;
        ListNode a,b;
        a = head;
        b = head;
        
        while(a != null&& a.next != null){
            a= a.next.next;
            b = b.next;
            if(a==b){
                return true;
            }
        }
        return false;
    }
}