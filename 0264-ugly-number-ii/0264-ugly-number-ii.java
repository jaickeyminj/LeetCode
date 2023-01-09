class Solution {
    public int nthUglyNumber(int n) {
        if(n<6) return n;
        PriorityQueue<Long> q = new PriorityQueue();
        q.add(1L);

        for(long i=1; i<n; i++) {
            long tmp = q.poll();
            while(!q.isEmpty() && q.peek()==tmp) tmp = q.poll();

            q.add(tmp*2);
            q.add(tmp*3);
            q.add(tmp*5);
        }
        return q.poll().intValue(); 
    }
}