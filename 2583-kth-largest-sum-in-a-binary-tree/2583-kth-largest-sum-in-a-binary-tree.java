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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>((a,b)-> Long.compare(b,a));
        findSum(root,pq);
        if(pq.size()<k){
            return -1;
        }
        long ans = 0;
        // int size = pq.size();
        while(!pq.isEmpty() && k-->0){
            ans = pq.poll();
            // size-=1;
        }
        return ans;
    }
    
    public void findSum(TreeNode node, PriorityQueue<Long> pq){
        if(node == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(true){
            int size = q.size();
            if(size==0)
                break;
            long sum =0;
            while(size>0){
                TreeNode x = q.remove();
                sum+= x.val;
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
                size-=1;
            }
            pq.offer(sum);
        }
        return;
    }
}