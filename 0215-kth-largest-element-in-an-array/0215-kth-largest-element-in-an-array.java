class Solution {
    public int findKthLargest(int[] n, int K) {
        PriorityQueue<Integer> heap1 = new PriorityQueue<Integer>();
    
        for (int i = 0; i < n.length; ++i) {
            heap1.add(n[i]);
            if (heap1.size() > K) {
                heap1.remove();
            }
        }   
        return heap1.peek();
    }
}

   