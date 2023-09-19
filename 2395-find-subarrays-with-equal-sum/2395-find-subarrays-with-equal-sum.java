class Solution {
    public boolean findSubarrays(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=1;i<nums.length;i+=1){
            map.put(nums[i]+nums[i-1],map.getOrDefault(nums[i]+nums[i-1],0)+1);
            if(map.get(nums[i]+nums[i-1])>1)
                return true;
        }
        return false;
    }
}