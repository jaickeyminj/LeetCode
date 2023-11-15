class Solution {
    public int distinctSubseqII(String s) {
        return countSubsequences(s);
    }
    
    private int countSubsequences(String a){
        int len = a.length();
        int MOD = 1000000007;
        int dp[] = new int[len+1];
        
        dp[0] = 1; //Empty string has one sub-sequence
        
        int[] flag = new int[256];
        Arrays.fill(flag,-1);
        
        for(int i=1;i<len+1;i+=1){
            dp[i] = (dp[i-1] * 2) % MOD;
            
            if(flag[a.charAt(i-1)] != -1){
                dp[i] = (dp[i] - dp[flag[a.charAt(i-1)]-1] + MOD) % MOD;
            }
            
            flag[a.charAt(i-1)] = i;
        }
        // System.out.println(Arrays.toString(dp));
        return dp[len]-1 == -1 ? MOD-1 : dp[len] -1; //subtracting 1 because we want to exclude "" 
    }
}