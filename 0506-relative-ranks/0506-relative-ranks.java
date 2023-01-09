class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map = new HashMap<>();
        int i=1;
        for(int s:score){
            map.put(s,map.getOrDefault(s,0)+i);
            i+=1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(Integer key:map.keySet())
            pq.offer(key);
        String res[]= new String[i-1];
        i=1;
        while(!pq.isEmpty()){
            int element = pq.poll();
            int index = map.get(element);
            if(i==1)
                res[index-1]="Gold Medal";
            else if(i==2)
                res[index-1]="Silver Medal";
            else if(i==3)
                res[index-1]="Bronze Medal";
            else
                res[index-1]=Integer.toString(i);
            i+=1;
        }
        return res;
    }
}