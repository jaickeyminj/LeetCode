class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Map<String,Integer> map = new HashMap<>();
        // // Map<Integer,String> map2 = new HashMap<>();
        // for(int i=0;i<names.length;i+=1){
        //     map.put(names[i],heights[i]);
        //     // map2.put(heights[i],names[i]);
        // }
        // System.out.println(map);
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
        //     return map.get(b)-map.get(a);
        // });
        // for(int h:heights)
        //     pq.offer(h);
        // int i=0;
        // while(!pq.isEmpty()){
        //     int j = (pq.poll());
        //     for(String s: map.keySet())
        //         if(map.get(s)==j){
        //             names[i++]=s;
        //             break;
        //         }
        // }
        // return names;
        String res[] = new String[names.length];
        int ind = names.length;
        Map<Integer, String> map = new TreeMap<>();
        for(int i = 0;i<names.length;i++){
            map.put(heights[i], names[i]);
        }
        for(String p : map.values()){
            res[--ind] = p;
        }
        return res;
    }
}