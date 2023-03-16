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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);

        int inorderIdx = 0;
        for (int i = 1; i < preorder.length; i++) {
            TreeNode curr = stack.peek();
            if (curr.val != inorder[inorderIdx]) {
                curr.left = new TreeNode(preorder[i]);
                stack.push(curr.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIdx]) {
                    curr = stack.pop();
                    inorderIdx++;
                }
                curr.right = new TreeNode(preorder[i]);
                stack.push(curr.right);
            }
        }

        return root;
    }
}