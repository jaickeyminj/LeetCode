class Solution {
    public int coinChange(int[] coins, int amt) {
        int dp[][] = new int[13][10001];
        Arrays.sort(coins);
        for(int i=0;i<12;i+=1){
            dp[i][0] = 0;
        }
        for(int i=0;i<10001;i+=1){
            dp[0][i] = Integer.MAX_VALUE - 1;
        }
        
        for(int i=1;i<coins.length+1;i+=1){
            for(int j=1;j<amt+1;j+=1){
                if(coins[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j-coins[i-1]]);
                }
            }
        }
        return dp[coins.length][amt] == Integer.MAX_VALUE-1? -1 :dp[coins.length][amt];
    }
}