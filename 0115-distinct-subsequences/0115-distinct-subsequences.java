class Solution {
    public int numDistinct(String S, String T) {
        int[][] table = new int[S.length() + 1][T.length() + 1];
 
        for (int i = 0; i < S.length(); i++)
            table[i][0] = 1;

        for (int i = 1; i <= S.length(); i++) {
            for (int j = 1; j <= T.length(); j++) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    table[i][j] += table[i - 1][j] + table[i - 1][j - 1];
                } else {
                    table[i][j] += table[i - 1][j];
                }
            }
        }
	    return table[S.length()][T.length()];
    }
    
    /*private int countSubsequences(String a){
        int len = a.length();
        
        int dp[] = new int[len+1];
        
        dp[0] = 1; //Empty string has one sub-sequence
        
        int[] flag = new int[256];
        Arrays.fill(flag,-1);
        
        for(int i=1;i<len+1;i+=1){
            dp[i] = dp[i-1] * 2;
            
            if(flag[a.charAt(i-1)]!=-1){
                dp[i] = dp[i] - dp[flag[a.charAt(i-1)-1]];
            }
            
            flag[a.charAt(i-1)] = i;
        }
        
        return dp[len];
    }*/
}