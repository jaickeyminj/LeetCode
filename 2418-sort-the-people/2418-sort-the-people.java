class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Pair<String,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<names.length;i++){
            pq.add(new Pair<>(names[i],heights[i]));
        }
        int i=0;
        String ans[]=new String[names.length];
        while(!pq.isEmpty()){
          ans[i++]=pq.poll().getKey();  
        }
        return ans;
    }
}