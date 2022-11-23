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
//     public boolean findTarget(TreeNode root, int k) {
//         Set<Integer> set = new HashSet<>();
        
//         return findMe(root,k,set);
//     }
    
    // private boolean findMe(TreeNode root,int k,Set<Integer> set){
    //     if(root == null) return false;
    //     if(set.contains(k-root.val)) return true;
    //     set.add(root.val);
    //     return findMe(root.left,k,set)||findMe(root.right,k,set);
    // }
    
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> set = new ArrayList<>();
        inorder(root,set);
        int i=0;
        int j= set.size()-1;
        while(i<j){
            if(set.get(i)+set.get(j)==k) return true;
            else if(set.get(i)+set.get(j)<k) i+=1;
            else j-=1;
        }
        return false;
    }
    
    private void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}