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
// class Solution {
//     public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
//         List<Integer> l1=new ArrayList<>();
//         List<List<Integer>> b=new ArrayList<>();
//         inorder(root,l1);
//       //  System.out.println(l1);
//         for(int x:queries){
//             List<Integer> l2=new ArrayList<>();
//             int t1=lb(l1,x);
//             int t2=ub(l1,x);
//             // if index==list size then storing -1
//             if(t2==l1.size()){
//                 l2.add(-1);
//             }
//             else{
//                 l2.add(l1.get(t2));
//             }
//             // if index==list size then storing -1
//             if(t1==l1.size()){
//                 l2.add(-1);
//             }
//             else{
//                 l2.add(l1.get(t1));
//             }
//             b.add(l2);
//         }
//         return b;
//     }
//     //storing in sorted order of the tree values
//     public void inorder(TreeNode root,List<Integer> l1){
//         if(root==null){
//             return;
//         }
//         inorder(root.left,l1);
//         l1.add(root.val);
//         inorder(root.right,l1);
//     }
//     //finding lower bound
//     public int lb(List<Integer> l,int x){
//         int i=0;
//         int j=l.size()-1;
//         int ans=l.size();
//         while(i<=j){
//             int mid=(i+j)/2;
//             if(l.get(mid)>=x){
//                 ans=mid;
//                 j=mid-1;
//             }
//             else{
//                 i=mid+1;
//             }
//         }
//         return ans;
//     }
//     //finding upper bound
//     public int ub(List<Integer> l,int x){
//         int i=0;
//         int j=l.size()-1;
//         int ans=l.size();
//         while(i<=j){
//             int mid=(i+j)/2;
//             if(l.get(mid)<=x){
//                 i=mid+1;
//                 ans=mid;
//             }
//             else{
                
//                 j=mid-1;
//             }
//         }
//         return ans;
//     }
// 	}
// class Solution {
//     TreeMap<Integer, Integer> map = new TreeMap<>();

//     public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
//         List<List<Integer>> ans = new ArrayList<>();
//         helper(root);
//         for (int num : queries) {
// 		//if num is present add num else add lower value than num
//             Integer low = map.containsKey(num) ? Integer.valueOf(num) : map.lowerKey(num);
// 		//if num is present add num else add higher value than num
//             Integer high = map.containsKey(num) ? Integer.valueOf(num) : map.higherKey(num);
// 		//if low or high value also not present add -1 else add low or high
//             ans.add(Arrays.asList(low == null ? -1 : low, high == null ? -1 : high));
//         }
//         return ans;
//     }

//     void helper(TreeNode root) {
//         if (root == null) return;
//         map.put(root.val, 0);
//         helper(root.left);
//         helper(root.right);
//     }

// }
// class Solution {
//     public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
//         List<List<Integer>> ans = new ArrayList<>();
//         for(Integer i: queries){
//             ans.add(search(root,i));
//         }
//         return ans;
//     }
    
//     private List<Integer> search(TreeNode root, Integer i){
//         int lower = Integer.MIN_VALUE;
//         int upper = Integer.MAX_VALUE;
//         while(root != null){
//             if(root.val>i){
//                 upper = Math.min(upper,root.val);
//                 root= root.left;
//             }else if(root.val<i){
//                 lower = Math.max(lower,root.val);
//                 root= root.right;
//             }
//             else{
//                 return Arrays.asList(root.val,root.val);
//             }
            
//         }
//         if(lower==Integer.MIN_VALUE){
//             lower = -1;
//         }
//         if(upper==Integer.MAX_VALUE){
//             upper = -1;
//         }
//         return Arrays.asList(lower,upper);
//     }
// }
class Solution {
    List<Integer> nodes = new ArrayList<>(); 
    void traverse(TreeNode root) {
        if (root == null) return;
        
        traverse(root.left);
        nodes.add(root.val);
        traverse(root.right);
    }
    
    List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        traverse(root);                         // traverse all nodes and store them in ArrayList
        
        List<List<Integer>> ans = new ArrayList<>();
        int n = nodes.size();
        
        for (int q : queries) {            
            if (q == nodes.get(0) || q == nodes.get(n-1)) {           // if value is already found, no need to do BS
            	ans.add(Arrays.asList(q, q));
            }
            else if (q < nodes.get(0)) {
            	ans.add(Arrays.asList(-1, nodes.get(0)));             // if value == first element, no need to do BS
            }
            else if (q > nodes.get(n-1)) {
            	ans.add(Arrays.asList(nodes.get(n-1), -1));          // if value == last element, no need to do BS
            }
            else {
            	int lo = 0;
            	int hi = n-1;
            	boolean found = false;
            	while (lo < hi) {
            		int m = (lo+hi) >> 1;
            		int mid = nodes.get(m);
            		if (q == mid) {
            			found = true;
            			ans.add(Arrays.asList(q, q));
            			break;
            		}
            		else if (q > mid) {
            			lo = m + 1;
            		}
            		else {
            			hi = m;
            		}
            	}
            	
				// now lo and hi are equal
            	if (!found) {
            		ans.add(Arrays.asList(nodes.get(lo-1), nodes.get(lo)));
            	}
            }
        }
        
        return ans;
    } 
}