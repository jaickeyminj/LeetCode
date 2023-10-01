class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n + 1][6];
        for (int i = 1; i <= n; i+=1){
            for (int k = 1; k <= 5; k+=1){
                if(i>1){
                    dp[i][k] = dp[i][k-1] + dp[i-1][k]; //one row/col before
                }
                else{
                    dp[i][k] = dp[i][k-1] + 1;
                }
                // dp[i][k] = dp[i][k - 1] + (i > 1 ? dp[i - 1][k] : 1);
            }
            // System.out.println(Arrays.toString(dp[i]));
        }
        return dp[n][5];
    }
}