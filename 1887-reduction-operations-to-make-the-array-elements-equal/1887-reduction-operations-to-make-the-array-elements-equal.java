class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int res = 0;
        for(int i=0;i<nums.length-1;i+=1){
            if(nums[i]!=nums[i+1]){
                // nums[i+1] = nums[i];
                cnt+=1;
            }
            res +=cnt;
        }
        return res;
    }
}