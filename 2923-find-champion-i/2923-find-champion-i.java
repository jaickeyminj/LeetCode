class Solution {
    public int findChampion(int[][] grid) {
        int row[] = new int[grid.length];
        
        int n = grid.length;
        int k=0;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i[]: grid){
            for(int j:i){
                row[k]+=j==0?0:1;
            }
            if(row[k]>max){
                max = row[k];
                ans = k;
            }
            k+=1;
        }
        return ans;
    }
}