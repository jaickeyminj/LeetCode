class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;

        int[] row_ones_count = new int[rows];
        int[] col_ones_count = new int[cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==1){
                    row_ones_count[i]++;
                    col_ones_count[j]++;
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int total_ones = row_ones_count[i] + col_ones_count[j];
                int total_zeros = (cols-row_ones_count[i]) + (rows-col_ones_count[j]);
                grid[i][j] =  total_ones - total_zeros;
            }
        }
        return grid;
    }
}