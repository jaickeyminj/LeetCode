class Solution {
    public boolean canPartition(int[] nums) {
        int sum  = 0;
        for(int i: nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        Map<Integer,Integer> map = new HashMap<>();
        // Set<Integer> set = new HashSet<>();
        map.put(0,0);
        // set.add(0);
        for(int i: nums){
            Map<Integer,Integer> map2 = new HashMap<>(map);
            // Set<Integer> set2 = new HashSet<>(set);
            for(Integer e : map2.keySet()){
                map.put(e+i,0);
                
            }
        }
        // System.out.println(sum/2);
        return map.containsKey(sum/2);
    }
}