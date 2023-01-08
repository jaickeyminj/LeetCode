class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if(map.get(a) == map.get(b)){
                return a - b;
            }
            return map.get(b) - map.get(a);
        });
        for(int i: map.keySet()){
            pq.offer(i);
        }
        
        return pq.size()==0?-1:pq.poll();
    }
}