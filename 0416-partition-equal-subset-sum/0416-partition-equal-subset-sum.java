class Solution {
    public boolean canPartition(int[] nums) {
        int sum  = 0;
        for(int i: nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        // Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        // map.put(0,0);
        set.add(0);
        for(int i: nums){
            // Map<Integer,Integer> map2 = map;
            Set<Integer> set2 = new HashSet<>(set);
            for(Integer e : set2){
                set.add(e+i);
                
            }
        }
        // System.out.println(sum/2);
        return set.contains(sum/2);
    }
}