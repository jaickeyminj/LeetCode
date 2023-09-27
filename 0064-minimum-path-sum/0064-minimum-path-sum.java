class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=1;i<n;i+=1){
            grid[i][0] +=grid[i-1][0]; //fill the first columns
        }
        for(int i=1;i<m;i+=1){
            grid[0][i] +=grid[0][i-1]; //fill the first rows
        }
        for(int i=1;i<n;i+=1){
            for(int j=1;j<m;j+=1){
                grid[i][j] = Math.min(grid[i][j-1],grid[i-1][j]) + grid[i][j]; // pick from one row above or pick from one column before
            }
        }
        return grid[n-1][m-1];
    }
}