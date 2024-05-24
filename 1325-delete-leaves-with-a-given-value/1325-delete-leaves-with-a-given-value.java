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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        removeLeafNodesHelper(root, target);
        if(isLeaf(root) && root.val == target ){
            return null;
        }
        return root;
    }

    void removeLeafNodesHelper(TreeNode node, int target) {
        if(node.left != null){
            removeLeafNodesHelper(node.left, target);
        }
        
        if(node.right != null){
            removeLeafNodesHelper(node.right, target);
        }

        if(node.left != null && isLeaf(node.left) && node.left.val == target){
            node.left = null;
        }

        if(node.right != null && isLeaf(node.right) && node.right.val == target){
            node.right = null;
        }

    }

    boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}