class Solution {
    public int uniquePaths(int m, int n) {
        int res[][] = new int[m][n];
        for(int i=0;i<m;i+=1){
            Arrays.fill(res[i],1); //fill all rows by 1
            // System.out.println(Arrays.toString(res[i]));
        }
        for(int i=1;i<m;i+=1){
            for(int j=1;j<n;j+=1){
                res[i][j] = res[i-1][j] + res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
}