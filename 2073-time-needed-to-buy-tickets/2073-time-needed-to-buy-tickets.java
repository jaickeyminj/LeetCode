class Solution {
//     public int timeRequiredToBuy(int[] tickets, int k) {
//         Queue<Integer> q = new LinkedList<>();
        
//         for(int i=0;i<tickets.length;i++){
//             q.add(i);
//         }
//         int x = 0;
//         int count = 0;
//         while(!q.isEmpty()){
//             x = q.peek();
//             if(tickets[x]>0){
//                 tickets[x]-=1;
//                 count+=1;
//                 if(tickets[x]==0 && k != (x)){
//                     q.remove();
//                 }
//                 else
//                     q.add(q.remove());
//                 if(tickets[x]==0 && k==(x)){
//                     return count;
//                 }
//             }
// //             else if(tickets[x-1]==0 && k != (x-1)){
                
// //             }
            
//             // System.out.println(q);
//         }
//         return count;
//     }
     public int timeRequiredToBuy(int[] tickets, int k) {
            int res = 0;
            for(int i = 0;i<tickets.length;i++){
                if(i <= k){
                    res += Math.min(tickets[k],tickets[i]);
                }else{
                    res += Math.min(tickets[k] - 1,tickets[i]);
                }
            }
            return res;
     }
}