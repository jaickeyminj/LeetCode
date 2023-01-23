// class Solution {
//     public long totalCost(int[] costs, int k, int candidates) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<costs.length;i+=1){
//             map.put(i,costs[i]);
//         }
//         PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->{
//             if(a.getValue()==b.getValue()){
//                 return a.getKey()-b.getKey();
//             }
//             return a.getValue()-b.getValue();
//         });
//         for(Map.Entry<Integer,Integer> m: map.entrySet()){
//             pq.offer(m);
//         }
//         long cnt =0L;
//         // System.out.println(pq);
//         long x;
//         while(!pq.isEmpty()&& k>0){
//             x = pq.poll().getValue();
//             System.out.print(x+" ");
//             cnt+=x;
//             k--;
//         }
//         System.out.println();
//         return cnt;
//     }
// }
class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long cost = 0;
		//sort based on value , if value is equal then index
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0] == b[0]? a[1] - b[1] : a[0] - b[0]);
        int i = 0;
        int j = costs.length - 1;
        while(i < j && candidates > 0) {
			// 2nd index is -1 for left and 1 for right
            queue.add(new int[]{costs[i], i, -1});
            queue.add(new int[]{costs[j], j,  1});
            i++;
            j--;
            candidates--;
        }
        if(i == j && candidates > 0) {
			// if array length is odd, we need to handle this
            queue.add(new int[]{costs[i], i, -1});
            i++;
        }
       
        while(k > 0) {
            int[] item = queue.remove();
            cost += item[0];
			// if we are removing an index from left, we will add from left
            if(item[2] == -1 && i < j) {
                 queue.add(new int[]{costs[i], i, -1});
                i++;
            }
			// if we are removing an index from right, we will add from right
            if(item[2] == 1 && i < j) {
                queue.add(new int[]{costs[j], j, 1});
                j--;
            }
			// Handling this might not require but I am sharing the exact solution which I used
            if(i == j) {
                queue.add(new int[]{costs[i], i, -1});
                i++;
            }
            k--;
        }
        return cost;
    }
}