class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a,b)->{
            return ((int)(Math.pow(0-a[0],2)+Math.pow(0-a[1],2)))-
                ((int)(Math.pow(0-b[0],2)+Math.pow(0-b[1],2)));
        });
        int len = points.length;
        for(int abc[]: points){
            pq.offer(new Integer[]{abc[0],abc[1]});
        }
        int[][] ans = new int[k][2];
        for(int i=0;!pq.isEmpty()&&k>0;k-=1,i+=1){
            Integer a[]=pq.poll();
            ans[i][0]=a[0];
            ans[i][1]=a[1];
        }
        return ans;
    }
}