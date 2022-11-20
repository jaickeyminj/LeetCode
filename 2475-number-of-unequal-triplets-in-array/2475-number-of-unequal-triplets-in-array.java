class Solution {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        int l=0, r = n;
        for(int key: map.keySet()){
            int freq = map.get(key);
            r -= freq;
            count += l*freq*r;
            l += freq;
        }
        
        return count;
    }
}