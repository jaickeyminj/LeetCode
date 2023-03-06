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
    public int maxLevelSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        findSum(root,map);
        int i = 1;
        int ans = map.get(1);
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()>ans){
                ans = m.getValue();
                i = m.getKey();
            }
        }
        return i;
    }
    public void findSum(TreeNode node,HashMap<Integer,Integer> map){
        if(node == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int i=1;
        while(true){
            int size = q.size();
            if(size==0)
                break;
            int sum =0;
            while(size>0){
                TreeNode x = q.remove();
                sum+= x.val;
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
                size-=1;
            }
            // pq.offer(sum);
            map.put(i++,sum);
        }
        return;
    }

}