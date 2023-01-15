class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat = new int[n][n];
        int len = queries.length;
        
        for(int m[]: queries){
            // for(int i=m)
            int row1 = m[0];
            int col1 = m[1];
            int row2 =m[2];
            int col2 = m[3];
            for(int i= row1;i<=row2;i+=1){
                for(int j = col1;j<=col2;j+=1){
                    mat[i][j]+=1;
                }
            }
        }
        return mat;
    }
    
    
}