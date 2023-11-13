class Solution {
    public String shortestCommonSupersequence(String X, String Y) {
        
        int m = X.length();
        int n = Y.length();
        
        if(X.equals(Y)) return Y;
        int dp[][] = new int[m+1][n+1];
        
        
        for(int i=1;i<m+1;i+=1){
            for(int j=1;j<n+1;j+=1){
                if(X.charAt(i-1) == Y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int l = X.length() + Y.length() - dp[m][n];
        String str1 = X;
        String str2 = Y;
        char chars [] = new char[l];
        while (m > 0 && n > 0) {
            char current;
            if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
                current = str1.charAt(m - 1);
                m--;
                n--;
            } else {
                if (dp[m - 1][n] > dp[m][n - 1]) {
                    current = str1.charAt(m - 1);
                    m--;
                } else {
                    current = str2.charAt(n - 1);
                    n--;
                }
            }
            chars[l -1] = current;
            l--;
        }
        while (m > 0) {
            chars[l -1] = str1.charAt(m - 1);
            l--;
            m--;
        }
        while (n > 0) {
            chars[l -1] = str2.charAt(n - 1);
            l--;
            n--;
        }
        return new String(chars);
    }
}