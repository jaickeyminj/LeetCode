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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        myTraversal(root);
        return root;
    }
    
    private void myTraversal(TreeNode root){
        if(root==null) return;
        myTraversal(root.right);
        root.val+=sum;
        sum=root.val;
        myTraversal(root.left);
    }
}