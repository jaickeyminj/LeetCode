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
public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        // Create a queue for nodes that need to be visited and add the root
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode current = root;
        queue.add(current);

        // Keeps track of whether we are on an even level
        boolean even = true;

        // While there are more nodes in the queue
        // Determine the size of the level and handle the nodes
        while (!queue.isEmpty()) {
            int size = queue.size();

            // Prev holds the value of the previous node in this level
            int prev = Integer.MAX_VALUE;
            if (even) {
                prev = Integer.MIN_VALUE;
            }

            // While there are more nodes in this level
            // Remove a node, check whether it satisfies the conditions
            // Add its children to the queue
            while (size > 0) {
                current = queue.poll();

                // If on an even level, check that the node's value is odd and greater than prev
                // If on an odd level, check that the node's value is even and less than prev
                if ((even && (current.val % 2 == 0 || current.val <= prev)) ||
                        (!even && (current.val % 2 == 1 || current.val >= prev))) {
                    return false;
                }

                prev = current.val;
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                // Decrement size, we have handled a node on this level
                size--;
            }
            // Flip the value of even, the next level will be opposite
            even = !even;
        }
        // If every node meets the conditions, the tree is Even-Odd
        return true;
    }
}
