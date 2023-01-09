class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> q = new PriorityQueue<>((e,d)->d-e);
        
        q.offer(a);
        q.offer(b);
        q.offer(c);
        int ans = 0;
        while(q.size()>1&&!q.isEmpty()){
            int i = q.poll();
            int j = q.poll();
            i-=1;
            j-=1;
            ans+=1;
            if(i>0)
                q.offer(i);
            if(j>0)
                q.offer(j);
        }
        
        return ans;
    }
}