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
    private int max = Integer.MIN_VALUE;
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        max = Integer.MIN_VALUE;
        inorder(root,map,max);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            max = Math.max(entry.getValue(),max);
        }
        int cnt = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(max == entry.getValue()) cnt+=1;
        }
        int res[] = new int[cnt];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(max == entry.getValue()) res[i++]=entry.getKey();
        }
        return res;
    }
    public void inorder(TreeNode root, Map<Integer,Integer> map, int max){
        if(root!=null){
            inorder(root.left,map,max);
            map.put(root.val,map.getOrDefault(root.val,0)+1);
            max = Math.max(max,map.get(root.val));
            // System.out.println(max);
            inorder(root.right,map,max);
        }
    }
}