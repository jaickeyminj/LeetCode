class Solution {
//     public int findTheWinner(int n, int k) {
//         Queue<Integer> q = new LinkedList<>();
        
//         for(int i=1;i<=n;i++){
//             q.offer(i);
//         }
        
//         while(q.size()!=1){
//             for(int i=0;i<k-1;i++)
//                 q.offer(q.poll());
//             q.poll();
//         }
//         return q.poll();
//     }
    public int findTheWinner(int n, int k) {
        return helper(n,k)+1;
    }
    public int helper(int n, int k) {
        if(n==1) return 0;
        else return (helper(n-1,k)+k)%n;
    }
}