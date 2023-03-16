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
    
//     public TreeNode buildTree(int[] inorder, int[] postorder) {
//         if (inorder.length == 0 || postorder.length == 0) {
//             return null;
//         }

//         // The last element in postorder is the root of the tree
//         TreeNode root = new TreeNode(postorder[postorder.length-1]);

//         // Find the index of the root in inorder traversal
//         int inorderRootIdx = 0;
//         for (int i = 0; i < inorder.length; i++) {
//             if (inorder[i] == root.val) {
//                 inorderRootIdx = i;
//                 break;
//             }
//         }

//         // Recursively build the left and right subtrees
//         root.left = buildTree(Arrays.copyOfRange(inorder, 0, inorderRootIdx), 
//                               Arrays.copyOfRange(postorder, 0, inorderRootIdx));
//         root.right = buildTree(Arrays.copyOfRange(inorder, inorderRootIdx+1, inorder.length), 
//                                Arrays.copyOfRange(postorder, inorderRootIdx, postorder.length-1));

//         return root;
//     }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        stack.push(root);

        int inorderIdx = inorder.length-1;
        for (int i = postorder.length-2; i >= 0; i--) {
            TreeNode curr = stack.peek();
            if (curr.val != inorder[inorderIdx]) {
                curr.right = new TreeNode(postorder[i]);
                stack.push(curr.right);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIdx]) {
                    curr = stack.pop();
                    inorderIdx--;
                }
                curr.left = new TreeNode(postorder[i]);
                stack.push(curr.left);
            }
        }

        return root;
    }
}