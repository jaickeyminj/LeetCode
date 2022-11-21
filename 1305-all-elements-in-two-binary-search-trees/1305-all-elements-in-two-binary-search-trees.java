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
//     public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
//         List<Integer> ans = new ArrayList<>();
//         inorder(root1,ans);
//         inorder(root2,ans);
//         Collections.sort(ans);
//         return ans;
//     }
//     public void inorder(TreeNode root,List<Integer> a){
//         if(root == null) return;
        
//         inorder(root.left,a);
//         a.add(root.val);
//         inorder(root.right,a);
//     }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        inorder(root1, q1);
        inorder(root2, q2);
        List<Integer> ans = new ArrayList<>();
        while (!q1.isEmpty() || !q2.isEmpty())
            if (q2.isEmpty())
                ans.add(q1.poll());
            else if (q1.isEmpty())
                ans.add(q2.poll());
            else
                ans.add(q1.peek() < q2.peek() ? q1.poll() : q2.poll());
        return ans;
    }
    private void inorder(TreeNode n, Queue<Integer> q) {
        if (n == null) return;
        inorder(n.left, q);
        q.offer(n.val);
        inorder(n.right, q);
    }
}