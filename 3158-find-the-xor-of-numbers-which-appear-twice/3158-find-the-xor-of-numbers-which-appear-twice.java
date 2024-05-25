class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int xor = 0;
        
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()==2){
                xor=xor^m.getKey();
            }
        }
        
        return xor;
    }
}