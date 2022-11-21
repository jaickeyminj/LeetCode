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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> l1=new ArrayList<>();
        List<List<Integer>> b=new ArrayList<>();
        inorder(root,l1);
      //  System.out.println(l1);
        for(int x:queries){
            List<Integer> l2=new ArrayList<>();
            int t1=lb(l1,x);
            int t2=ub(l1,x);
            // if index==list size then storing -1
            if(t2==l1.size()){
                l2.add(-1);
            }
            else{
                l2.add(l1.get(t2));
            }
            // if index==list size then storing -1
            if(t1==l1.size()){
                l2.add(-1);
            }
            else{
                l2.add(l1.get(t1));
            }
            b.add(l2);
        }
        return b;
    }
    //storing in sorted order of the tree values
    public void inorder(TreeNode root,List<Integer> l1){
        if(root==null){
            return;
        }
        inorder(root.left,l1);
        l1.add(root.val);
        inorder(root.right,l1);
    }
    //finding lower bound
    public int lb(List<Integer> l,int x){
        int i=0;
        int j=l.size()-1;
        int ans=l.size();
        while(i<=j){
            int mid=(i+j)/2;
            if(l.get(mid)>=x){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
    //finding upper bound
    public int ub(List<Integer> l,int x){
        int i=0;
        int j=l.size()-1;
        int ans=l.size();
        while(i<=j){
            int mid=(i+j)/2;
            if(l.get(mid)<=x){
                i=mid+1;
                ans=mid;
            }
            else{
                
                j=mid-1;
            }
        }
        return ans;
    }
	}