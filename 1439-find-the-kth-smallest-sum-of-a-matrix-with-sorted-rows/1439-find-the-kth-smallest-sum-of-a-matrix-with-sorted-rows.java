class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int col = Math.min(mat[0].length, k);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> nextPq;
        pq.add(0);
        for (int[] row : mat) {
             nextPq = new PriorityQueue<>((a,b)->b-a);
            
                for (int c = 0; c < col; c++) {
                    for (int i : pq) {
                        nextPq.add(i + row[c]);
                        if (nextPq.size() > k) {
                            nextPq.poll();
                        }
                    }
                }
            pq = nextPq;
        }
        return pq.poll();
    }
}