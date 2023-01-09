class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->{
            if(map.get(a)==map.get(b)){
                return a.compareTo(b);
            }
            return map.get(b)-map.get(a);
        });
        for(Character c: map.keySet())
            pq.offer(c);
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char c = pq.poll();
            int n = map.get(c);
            for(int i=0;i<n;i+=1)
                sb.append(c);
        }
        return sb.toString();
    }
}