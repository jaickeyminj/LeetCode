class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        for(int s:score){
            map.put(s,map.getOrDefault(s,0)+i);
            i+=1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(Integer key:map.keySet())
            pq.offer(key);
        String res[]= new String[i];
        i=1;
        while(!pq.isEmpty()){
            int index = map.get(pq.poll());
            switch(i){
                case 1:
                    res[index]=new StringBuilder().append("Gold Medal").toString(); 
                    break;
                case 2:
                    res[index]=new StringBuilder().append("Silver Medal").toString();
                    break;
                case 3:
                    res[index]=new StringBuilder().append("Bronze Medal").toString();
                    break;
                default:
                    res[index]=Integer.toString(i);
                    break;
            }
            i+=1;
        }
        return res;
    }
}