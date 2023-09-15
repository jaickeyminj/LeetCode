class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] isVisited = new boolean[n];
        int ans = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
           return a[2] - b[2];
        });
        
        int left = n;
        for(int i=1; i<n; i++) {
            int dist = Math.abs(points[0][0] - points[i][0]) + Math.abs(points[0][1] - points[i][1]);
            pq.offer(new int[]{0, i, dist});
        }

        isVisited[0] = true;
        left--;
        while(left > 0) {
            int[] val = pq.poll();
            if(isVisited[val[1]]) continue;
            ans += val[2];
            isVisited[val[1]] = true;
            left--;
            for(int i=0; i<n; i++) {
                if(!isVisited[i]) {
                    int dist = Math.abs(points[val[1]][0] - points[i][0]) 
                        + Math.abs(points[val[1]][1] - points[i][1]);
                    pq.offer(new int[]{val[1], i, dist});
                }
            }
        }

        return ans;
    }
}