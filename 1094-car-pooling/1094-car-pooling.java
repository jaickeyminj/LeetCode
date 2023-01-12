class Solution {
//     public boolean carPooling(int[][] trips, int capacity) {
//         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
//             if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
//             return Integer.compare(a[0], b[0]);
//         });

//         for(int[] trip : trips){
//             pq.offer(new int[]{trip[1], trip[0]});
//             pq.offer(new int[]{trip[2], -trip[0]});
//         }
//         while(!pq.isEmpty()){
//             capacity -= pq.poll()[1];
//             if(capacity < 0) return false;
//         }
//         return true;
//     }
    public boolean carPooling(int[][] trips, int capacity) {
        int lengthOfTrip[] = new int[1001];
        
        for(int trip[] : trips){
            lengthOfTrip[trip[1]] += trip[0]; 
            lengthOfTrip[trip[2]] -= trip[0]; 
        }
        
        for(int passenger : lengthOfTrip){
            capacity -= passenger;
            if(capacity < 0) return false;
        }
        return true;
    }
}