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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        hasPath(root,0,targetSum,cur,list);
        return list;
    }
    public void hasPath(TreeNode root, int sum,int totalSum,List<Integer> cur,List<List<Integer>> list) {
        if(root == null) return;

        if(root.left == null && root.right == null && sum+root.val == totalSum){
            cur.add(root.val);
            list.add(new ArrayList<>(cur));
            cur.remove(cur.size()-1);
        }
        cur.add(root.val);
        hasPath(root.left, sum + root.val,totalSum,cur,list);
        
        hasPath(root.right, sum + root.val,totalSum,cur,list);
        cur.remove(cur.size()-1);
    }
}

