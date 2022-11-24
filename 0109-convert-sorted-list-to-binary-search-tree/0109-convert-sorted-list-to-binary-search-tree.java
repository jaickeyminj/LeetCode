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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private ListNode curr;
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        int count = height(head);
        curr = head;
        return makeBST(0,count-1);
    }
    
    private TreeNode makeBST(int i,int j){
        if(i>j) return null;
        int mid = (j-i)/2 + i;
        TreeNode node = new TreeNode();
        node.left = makeBST(i,mid-1);
        node.val = curr.val;
        curr = curr.next;
        node.right = makeBST(mid+1,j);
        return node;
    }
    
    private int height(ListNode node){
        int cnt =0;
        while(node != null){
            cnt++;
            node = node.next;
        }
        return cnt;
    }
}