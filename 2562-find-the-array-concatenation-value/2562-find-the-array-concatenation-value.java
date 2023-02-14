class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0l;
        for (int i = 0; i<nums.length-1-i; ++i){
            ans += concate(nums[i], nums[nums.length-1-i]);
        }
        if (nums.length % 2 == 1){
            return ans + nums[nums.length/2];
        }
        return ans;
    }
    
    public long concate(int a, int b){
        if (b == 0) return ((long) a)*10;
        for (int i = 1; i<1000000; i*=10){
            if (b/i == 0){
                return ((long)a) * i + b;
            }
        }
        // impossible
        return -1;
    }
}