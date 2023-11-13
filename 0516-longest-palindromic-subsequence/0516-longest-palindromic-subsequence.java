class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
// Just like LCS
// Find common in between the original and the reversed string of original string
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        
        return lcs(s,sb.reverse().toString());
    }
    
    public int lcs(String X,String Y){
        int m = X.length();
        int n = Y.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=1;i<m+1;i+=1){
            for(int j=1;j<n+1;j+=1){
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[m][n];
    }
}