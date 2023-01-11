class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int preSum[][] = new int[n+1][m+1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k+1);
        for(int i=0;i<n;i+=1){
            for(int j=0;j<m;j+=1){
                preSum[i+1][j+1]=
                   matrix[i][j] ^ preSum[i][j + 1] ^ preSum[i + 1][j] ^ preSum[i][j];
                pq.offer(preSum[i + 1][j + 1]);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }
        // System.out.println(Arrays.deepToString(preSum) +"\n"+pq);

        return pq.poll();
        
    }
}