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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1= list1;
        ListNode temp2 = list2;
        int x =a;
        while(temp1!=null&& --a>0){
            // a--;
            temp1 = temp1.next;
        }
        temp2= list1;
        while(temp2!=null&& b-->0){
            temp2= temp2.next;
        }
        ListNode end = list2;
        while(end.next!=null) end=end.next;
        
        end.next = temp2.next;
        temp1.next = list2;
        return  list1;
    }
}