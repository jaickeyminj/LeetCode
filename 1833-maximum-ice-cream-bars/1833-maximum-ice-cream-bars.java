class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        // for(int i:costs)
        //     pq.offer(i);
        // int max =0;
        // while(!pq.isEmpty()&& coins>0){
        //     int poll = pq.poll();
        //     max += coins-poll>=0?1:0; 
        //     coins-=poll;
        // }
        // return max;
        Arrays.sort(costs);
        int max = costs.length;
        for(int i:costs){
            if(coins-i>=0){
                coins-=i;
                max-=1;
            }
            else{
                break;
            }
        }
        return costs.length-max;
    }
}