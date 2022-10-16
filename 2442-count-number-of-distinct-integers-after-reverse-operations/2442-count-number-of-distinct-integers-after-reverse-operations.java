class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = null;
        for(int i: nums){
            sb = new StringBuilder();
            
            // if(!set.contains(i))
            set.add(Integer.parseInt(sb.append(Integer.toString(i)).reverse().toString()));
            set.add(i);
        }
        return set.size();
    }
}