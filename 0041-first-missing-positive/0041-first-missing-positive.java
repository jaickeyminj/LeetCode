class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int i =1;
        for (int j:nums){
            map.put(j,map.getOrDefault(j,0));
        }
        for(int j: nums){
            if(!map.containsKey(i)){
                return i;
            }
            i+=1;
        }
        return i;
    }
}