class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[365 + 30 + 1];
        HashSet set = new HashSet<>();
        for (int i:days) 
            set.add(i);
        for (int i = 365; i >=1; i--) {
            if (!set.contains(i)){
                dp[i] = dp[i+1];
                continue;
            }
            dp[i] = Math.min(dp[i+1] + costs[0], dp[i+7] + costs[1]);
            dp[i] = Math.min(dp[i], dp[i+30] + costs[2]);
        }
        return dp[1];
    }
}