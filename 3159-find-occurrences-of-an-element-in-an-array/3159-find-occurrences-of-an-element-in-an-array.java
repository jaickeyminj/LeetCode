class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int res[]= new int[queries.length];
        
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        Map<Integer,Integer> freq = new HashMap<>();
        
        for(int ii=0;ii<nums.length;ii+=1){
            int i= nums[ii];
            if(i!=x) continue;
            freq.put(i,freq.getOrDefault(i,0)+1);
            
            if(map.get(i)!=null){
                ArrayList<Integer> al = map.get(i);
                al.add(ii);
                map.put(i,new ArrayList<>(al));
            }else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(ii);
                map.put(i,al);
            }
        }
        //System.out.println(map);
        //System.out.println(freq);
        for(int i=0;i<queries.length;i+=1){
            if(freq.get(x)==null||freq.get(x)<queries[i]){
                res[i]=-1;
            }
            else{
                res[i]= map.get(x).get(queries[i]-1);
            }
            //System.out.println(Arrays.toString(res));
        }
        
        return res;
    }
}