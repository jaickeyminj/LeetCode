class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int i:nums)
            pq.offer(i);
        long ans =0;
        while(!pq.isEmpty()&&k>0){
            int peak = pq.poll();
            ans+=peak;
            k-=1;
            pq.offer((int)Math.ceil((double)peak/(double)3));
        }
        return (long)ans;
    }
}