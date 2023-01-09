class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map = new HashMap<>();
        int i=1;
        for(int s:score){
            map.put(s,map.getOrDefault(s,0)+i); //store the index in value
            i+=1;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(Integer key:map.keySet())
            pq.offer(key);
        // System.out.println(map+" "+pq);
        String res[]= new String[i-1];
        i=1;
        while(!pq.isEmpty()){
            int element = pq.poll();
            int index = map.get(element);
            // if(i<4)
                if(i==1)
                    res[index-1]="Gold Medal";
                else if(i==2)
                    res[index-1]="Silver Medal";
                else if(i==3)
                    res[index-1]="Bronze Medal";
                else
                    res[index-1]=""+i;
                i+=1;
        }
        return res;
    }
}