class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i:nums){
            pq.offer(i);
        }
        int i=2;
        int res =1;
        while(i>0){
            res*= pq.poll()-1;
            i-=1;
        }
        return res;
    }
}