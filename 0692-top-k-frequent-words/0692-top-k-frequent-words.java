class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        
        for(String w: words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            if(map.get(a)==map.get(b)){
                return a.compareTo(b);
            }
            
            return map.get(b)-map.get(a);
        });
        
        for(String a: map.keySet()){
            pq.offer(a);
        }
        List<String> ans = new ArrayList<>();
        for(;!pq.isEmpty()&&k>0;k-=1){
            ans.add(pq.poll());
        }
        
        return ans;
    }
}