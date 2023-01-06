class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        for(int i:costs)
            pq.offer(i);
        // System.out.println(pq);
        int max =0;
        while(!pq.isEmpty()&& coins>0){
            int poll = pq.poll();
            max += coins-poll>=0?1:0; 
            coins-=poll;
        }
        return max;
    }
}