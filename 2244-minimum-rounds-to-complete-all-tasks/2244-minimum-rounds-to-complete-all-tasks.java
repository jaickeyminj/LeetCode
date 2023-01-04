class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans =0;
        for(Integer i: map.values()){
           if(i==1)
               return -1;
            
            if(i%3==0)
                ans+=i/3;
            else{
                ans+=i/3+1;
            }
        }
        
        return ans;
    }
}