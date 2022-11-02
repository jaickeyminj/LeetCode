class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0)    return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int result = 0;
        map.put(0, 1);
        for(int cur : nums) {
            sum += cur;
            if(map.containsKey(sum - k))
                result += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result; 
    }
}