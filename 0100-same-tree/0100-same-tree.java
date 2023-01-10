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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        helper(p,a);
        helper(q,b);
        // System.out.println(a+"\n"+b);
        // return a.toString().contentEquals(b.toString());
        return a.equals(b);
    }
    
    public void helper(TreeNode p,List<Integer> a){
        if(p!=null){
            a.add(p.val);
            helper(p.left,a);
            helper(p.right,a);
        }else{
            a.add(null);
            return;
        }
    }
}