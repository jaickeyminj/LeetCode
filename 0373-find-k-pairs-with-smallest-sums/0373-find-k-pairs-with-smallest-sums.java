class Solution {
//     public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
//         List<List<Integer>> ans = new ArrayList<>();
//         PriorityQueue<int[]> q = new PriorityQueue<>((a,b)-> (a[0]+a[1]) - (b[0]+b[1]));
     
//         if(nums1.length==0 || nums2.length==0 || k==0) return ans;
//         int n1 = nums1.length;
//         int n2 = nums2.length;
        
//         for(int i = 0; i < Math.min(n1, k); i++){
//             q.offer(new int[]{nums1[i], nums2[0], 0});
//         }
        
//         // for(int i = 0; i < Math.min(n1*n2, k); i++){
//           while(k-- > 0 && !q.isEmpty()){
//             int[] cur = q.poll();
//             ArrayList<Integer> l = new ArrayList<>();
//             l.add(cur[0]);
//             l.add(cur[1]);
//             ans.add(l);
//             // if(cur[2] < n2-1){
//             int firstEle = cur[0];
//             if(cur[2] == nums2.length-1) continue;
//             int newInd = cur[2] + 1;
//             q.offer(new int[] {firstEle, nums2[newInd], newInd});
//             // }
            
//         }
        
        
//         return ans;
//     }
        
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
        List<List<Integer>> res = new ArrayList();
        int N1 = nums1.length, N2 = nums2.length;
        if (N1 == 0 || N2 == 0) 
            return res;
        for (int i = 0; i < Math.min(N1, k); i++) 
            q.offer(new int[]{nums1[i], nums2[0], 0});
        for (;!q.isEmpty()&&k-->0;) {
            int[] cur = q.poll();
            ArrayList<Integer> l = new ArrayList<>();
            l.add(cur[0]);
            l.add(cur[1]);
            res.add(l);
            if (cur[2] < N2 - 1 ) { 
                int idx = cur[2] + 1;
                q.offer(new int[]{cur[0], nums2[idx], idx});
            }
        }
        return res;        
    }
}
