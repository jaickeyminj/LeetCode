class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(int j:nums){
            pq.offer(j);
        }
        
        for(;!pq.isEmpty();)
            nums[i++]=pq.poll();
        
        return nums;
    }
}