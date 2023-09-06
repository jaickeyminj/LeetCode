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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode res[] = new ListNode[k];
        if (head == null || k==0)
            return res;
        int index =0;
        int size =0;
        ListNode temp = head;
        
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        
        int portion = size/k;
        int left = size %k;
        // System.out.println(left +" "+portion);
        ListNode cur = head;
        
        while(cur != null){
            temp = cur;
            int diff = left>0? 0+1:1-1;
            // System.out.println(left+" "+diff);
            for(int j=0;j<portion+diff-1;j++){
                cur = cur.next;
            }
            // System.out.println(cur.val+"->");
            ListNode temp1 = cur.next;
            cur.next = null;
            cur = temp1;
            res[index++]= temp;
            left--;
        }
        return res;
    }
}