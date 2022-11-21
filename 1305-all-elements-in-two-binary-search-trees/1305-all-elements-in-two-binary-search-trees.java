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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans = new ArrayList<>();
        inorder(root1,ans);
        inorder(root2,ans);
        Collections.sort(ans);
        return ans;
    }
    public void inorder(TreeNode root,List<Integer> a){
        if(root == null) return;
        
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
}