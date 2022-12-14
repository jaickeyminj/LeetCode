class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        for(Integer i: map.keySet()){
            if(set.contains(map.get(i)))
                return false;
            set.add(map.get(i));
        }
        return true;
    }
}