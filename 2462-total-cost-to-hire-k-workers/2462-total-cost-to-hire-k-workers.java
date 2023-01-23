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
        long res = 0L;
        int n = costs.length;
        if(2*candidates > n) return getK(costs, k);
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int l = 0, r = n-1;
        while(l<candidates){
            left.add(costs[l]);
            l++;
        }
        while(r >=n - candidates){
            right.add(costs[r]);
            r--;
        }
        while(k>0){
            if(!left.isEmpty() && !right.isEmpty()){
                if(left.peek() > right.peek()){
                    res += right.poll();
                    if(l<=r){
                        right.add(costs[r]);
                        r--;
                    }
                }else if(left.peek() < right.peek()){
                    res += left.poll();
                    if(l<=r){
                        left.add(costs[l]);
                        l++;
                    }
                }else{
                    res += left.poll();
                    if(l<=r){
                        left.add(costs[l]);
                        l++;
                    }
                }
            }else if(left.isEmpty()){
                res += right.poll();
                    if(l<=r){
                        right.add(costs[r]);
                        r--;
                    }
            }else if(right.isEmpty()){
                res += left.poll();
                    if(l<=r){
                        left.add(costs[l]);
                        l++;
                    }
            }
            k--;
        }
        return res;
    }
    public long getK(int[] costs, int k){
        long res = 0L;
        Arrays.sort(costs);
        for(int i = 0; i<k; i++){
            res += costs[i];
        }
        return res;
    }
}
