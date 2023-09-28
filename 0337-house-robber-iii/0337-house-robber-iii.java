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
    public int rob(TreeNode root) {
        int res[] = robFun(root);
        return Math.max(res[0],res[1]);
    }
    
    public int[] robFun(TreeNode root){
        if(root==null)
            return new int[]{0,0};
        int left[] = robFun(root.left);
        int right[] = robFun(root.right);
        return new int[]{(root.val+left[1]+right[1]),
                         Math.max(left[0],left[1])+ Math.max(right[0],right[1])};
        //Explaination - https://leetcode.com/problems/house-robber-iii/discuss/376297/Python3-Dynamic-Programming-%2B-Depth-First-Search
    }
}