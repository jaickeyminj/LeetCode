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
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode root, int min, int max) {
        return (root==null)? max-min : Math.max(dfs(root.left, 
                                                    Math.min(min,root.val), Math.max(max,root.val)), 
                                                dfs(root.right, Math.min(min,root.val), Math.max(max,root.val)));
        // if (root == null) return max - min;
        // max = Math.max(max, root.val);
        // min = Math.min(min, root.val);
        // return Math.max(dfs(root.left, min, max), dfs(root.right, min, max));
    }
}