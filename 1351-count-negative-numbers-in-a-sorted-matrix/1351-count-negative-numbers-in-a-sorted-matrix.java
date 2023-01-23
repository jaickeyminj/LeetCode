class Solution {
//     public int countNegatives(int[][] grid) {
//         int res=0;
        
//         for(int i=0;i<grid.length;i++){
//             if(grid[i][0]<0) {
//                 res+= grid[0].length;
//                 continue;
//             }
//             if(grid[i][grid[0].length-1]>-1){
//                 continue;
//             }
//             for(int j=0; j<grid[0].length;j++){
//                 if(grid[i][j]<0){
//                     res++;
//                 }
//                 else{
//                     continue;
//                 }
//             }
//         }
//         return res;
//     }
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length, r = m - 1, c = 0, cnt = 0;
        while (r >= 0 && c < n) {
            if (grid[r][c] < 0) {
                r-=1;
                cnt += n - c; // there are n - c negative numbers in current row.
                // System.out.println(cnt);
            }else {
                c+=1;
            }
        }
        return cnt;
    }
}