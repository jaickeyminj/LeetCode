class Solution {
    /*public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp = {nums[0], Math.max(nums[0], nums[1])};
        int index=0;
        for(int i=2; i<nums.length; i++){
            index = i&1; // i&1 === i%2.  //index^1: 0->1, 1->0.//even
        	dp[index] = Math.max(nums[i]+dp[index], dp[index^1]); 
        }
        // System.out.println(Arrays.toString(dp));
		return Math.max(dp[0], dp[1]);
	}*/
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i+=1){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}