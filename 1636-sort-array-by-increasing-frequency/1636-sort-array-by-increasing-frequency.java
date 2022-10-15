class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
     
        for(int i : nums)
            map.put(i,map.getOrDefault(i,0)+1); 
        List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (a,b) -> a.getValue() == b.getValue() ? 
                         b.getKey() - a.getKey() : a.getValue() - b.getValue());
        int index = 0;
        int[] res = new int[nums.length];
        
        for (Map.Entry<Integer, Integer> entry : list) {
            
            int count = entry.getValue();
            int key = entry.getKey();
            
            for (int i=0; i<count; i+=1) {
                res[index] = key;
                index+=1;
            }
        }
        return res;
    }
}