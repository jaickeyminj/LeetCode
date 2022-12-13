class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        
        for(int i=1;i<n;i+=1){
            for(int j=0;j<n;j+=1){
                if(j==0){
                    matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j+1]);
                }
                else if(j==n-1){
                    matrix[i][j] += Math.min(matrix[i-1][j],matrix[i-1][j-1]);
                }
                else{
                    matrix[i][j] += Math.min(matrix[i-1][j],Math.min(matrix[i-1][j+1],matrix[i-1][j-1]));
                }
            }
        }
        // System.out.println(Arrays.deepToString(matrix));
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i+=1){
            if(ans>matrix[n-1][i]){
                ans = matrix[n-1][i];
            }
        }
        return ans;
    }
}