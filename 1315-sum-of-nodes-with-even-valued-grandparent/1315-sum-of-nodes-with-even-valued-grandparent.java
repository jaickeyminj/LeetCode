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
    public int sumEvenGrandparent(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        
        //LevelOrderTraversal
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node.left != null) {
                q.add(node.left);
                if(node.val % 2 == 0) {
                    if(node.left.left != null) {
                        sum += node.left.left.val;
                    }
                    if(node.left.right != null) {
                        sum += node.left.right.val;
                    }
                }
            }

            if(node.right != null) {
                q.add(node.right);
                if(node.val % 2 == 0) {
                    if(node.right.left != null) {
                        sum += node.right.left.val;
                    }
                    if(node.right.right != null) {
                        sum += node.right.right.val;
                    }
                }
            }
        }
        
        return sum;
    }
}