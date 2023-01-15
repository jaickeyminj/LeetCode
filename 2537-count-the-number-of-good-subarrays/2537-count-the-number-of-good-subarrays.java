class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        // for(int i:nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        int n = nums.length;
        long res =0;
        int val =0;
        int first =0;
        for(int i=0;i<n;i+=1){
            if(map.containsKey(nums[i]))
                val += map.get(nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(val>=k){
                res += n-i;
                int cancel = map.getOrDefault(nums[first],0);
                val -=cancel-1;
                if(cancel == 1)
                    map.remove(nums[first]);
                else
                    map.put(nums[first],cancel-1);
                first+=1;
            }
        }
        return res;
    }
    
}