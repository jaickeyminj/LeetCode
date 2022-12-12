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
//     public boolean hasPathSum(TreeNode root, int sum) {
//         if(root == null) return false;

//         if(root.left == null && root.right == null) return sum == root.val;

//         return hasPathSum(root.left, sum - root.val) || 
//             hasPathSum(root.right, sum - root.val);
//     }
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPath(root,0,sum);
    }
    
    public boolean hasPath(TreeNode root, int sum,int totalSum) {
        if(root == null) return false;

        if(root.left == null && root.right == null) return sum+root.val == totalSum;

        return hasPath(root.left, sum + root.val,totalSum) || 
            hasPath(root.right, sum + root.val,totalSum);
    }
}