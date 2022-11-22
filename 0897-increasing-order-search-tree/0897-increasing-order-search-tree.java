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
    public TreeNode increasingBST(TreeNode root) {
        Queue<Integer> q = new LinkedList<>();
        inorder(root,q);
        TreeNode a = new TreeNode(0),cur=a;
        while(!q.isEmpty()){
            a.right = new TreeNode(q.poll());
            a = a.right;
        }
        return cur.right;
    }
    private void inorder(TreeNode root,Queue<Integer> q){
        if(root == null) return;
        inorder(root.left,q);
        q.offer(root.val);
        inorder(root.right,q);
    }
}