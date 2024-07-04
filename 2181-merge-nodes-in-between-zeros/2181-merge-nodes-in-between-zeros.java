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
    public ListNode mergeNodes(ListNode head) {
        // int count =0;
        // int sum=0;
        // ListNode temp = head.next;
        // ListNode res = new ListNode(0);
        // ListNode x= res;
        // while(temp!=null){
        //     // ListNode x= res;
        //     if(temp.val!=0){
        //         sum = sum + temp.val;
        //     }
        //     else{
        //         res.next = new ListNode(sum);
        //         // System.out.println(sum);
        //         sum =0;
        //         res= res.next;
        //     }
        //     temp= temp.next;
        // }
        // return x.next;
        
//         ListNode cur,root = new ListNode();
//         cur= root;
//         int sum =0;
//         while(head!=null){
//             if(head.val ==0 && sum!=0){
//                 // System.out.println(sum);
//                 cur.next = new ListNode(sum);
//                 cur = cur.next;
//                 sum =0;
//             }
            
//             sum +=head.val;
//             head= head.next;
//         }
//         return root.next;
        
        ListNode slow=head;
        ListNode fast=head;
        int sum=0;
        while(fast.next!=null)
        {
            sum+=fast.val;
            if(fast.next.val==0)
            {
                slow.val=sum;
                if(fast.next.next!=null)
                    slow=slow.next;
                sum=0;
            }
            fast=fast.next;
        }
        slow.next=null;
        
        return head;
    }
}