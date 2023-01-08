class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        // Iterator<Map.Entry<Integer, Integer>> entries = hm.entrySet().iterator();
        // while (entries.hasNext()) {
        //     Map.Entry<Integer, Integer> entry = entries.next();
        //     if(entry.getValue()>nums.length/2){
        //         return entry.getKey();
        //     }
        // }
        for(Map.Entry<Integer,Integer> map : hm.entrySet()){
            if(map.getValue()>nums.length/2)
                return map.getKey();
        }
        return -1;
    }
}