/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
//     TreeNode ans, target;
    
//     public void inorder(TreeNode o, TreeNode c) {
//         if (o == null) return;
//         inorder(o.left, c.left);
//         if (o == target) {
//                 ans = c;    
//         }
//         inorder(o.right, c.right);    
//     }
    
//     public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
//         this.target = target;
//         inorder(original, cloned);
//         return ans;
//     }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if( original == null ){
            return null;
        }
        
        if( original == target ){
            return cloned;
        }
        
        TreeNode left =  getTargetCopy(original.left, cloned.left, target);
        if( left != null ){ 
            return left; 
        
        }else{
            return getTargetCopy(original.right, cloned.right, target);
        }        
        
        
    }
}