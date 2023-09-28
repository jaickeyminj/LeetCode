class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int start = 0;
        int end = n-2;
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n-1;i+=1){
            dp[i] = Math.max(dp[(i-2)] + nums[i], dp[(i-1)]);
        }
        int max1 = dp[n-2];
        Arrays.fill(dp,0);
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1],nums[2]);
        for(int i=3;i<n;i+=1){
            dp[i] = Math.max(dp[i-2]+ nums[i],dp[i-1]);
        }
        int max2 = dp[n-1];
        return Math.max(max1,max2);
    }
}