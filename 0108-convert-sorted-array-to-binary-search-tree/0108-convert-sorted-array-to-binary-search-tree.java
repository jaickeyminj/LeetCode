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
    public TreeNode sortedArrayToBST(int[] nums) {
        return insertBST(nums,0,nums.length-1);
    }
    
    private TreeNode insertBST(int nums[],int low, int high){
        if(low>high) return null;
        int mid= (low+high)>>1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = insertBST(nums,low,mid-1);
        node.right = insertBST(nums,mid+1,high);
        return node;
    }
}