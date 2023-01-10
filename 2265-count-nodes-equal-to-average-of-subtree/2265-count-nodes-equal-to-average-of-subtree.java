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
    public int averageOfSubtree(TreeNode root) {
        ArrayDeque<TreeNode> ad = new ArrayDeque<>();
        ad.offer(root);
        int cnt=0;
        while(!ad.isEmpty()){
            TreeNode temp = ad.poll();
            List<Integer> al = new ArrayList<>();
            find(temp,al);
            // long sum = 0;
            // for(Integer i: al)
            //     sum+=i;
            long sum = al.get(al.size()-1);
            int avg =(int) sum/al.size();
            if(avg==temp.val)
                cnt+=1;
            if(temp.left!=null)
                ad.offer(temp.left);
            if(temp.right!=null)
                ad.offer(temp.right);
        }
        return cnt;
    }
    
    private void find(TreeNode root,List<Integer> al){
        if(root!=null){
            if(al.size()>0)
                al.add(root.val+ al.get(al.size()-1));
            else
                al.add(root.val);
            find(root.left,al);
            find(root.right,al);
        }
    }
}