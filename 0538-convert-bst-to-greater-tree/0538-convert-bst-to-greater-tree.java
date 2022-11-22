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
    // boolean flag = true;
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        // TreeNode ans = TreeNode();
        my(root);
        return root;
    }
    
    private void my(TreeNode root){
        if(root==null) return;
        my(root.right);
        // if(flag){
        //     // sum=root.val;
        //     flag=!flag;
        // }
        root.val+=sum;
        sum=root.val;
        my(root.left);
    }
}