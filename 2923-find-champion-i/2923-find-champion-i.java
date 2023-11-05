class Solution {
    public int findChampion(int[][] grid) {
        // int row[] = new int[grid.length];
        int row =0;
        int n = grid.length;
        int k=0;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i[]: grid){
            row=0;
            for(int j:i){
                row+=j==0?0:1;
            }
            if(row>max){
                max = row;
                ans = k;
            }
            k+=1;
        }
        return ans;
    }
}