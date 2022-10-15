class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int res = 0;
		
        Map<String, Integer> hm = new HashMap<>();
        for (int row[]:grid) {
            String a=Arrays.toString(row);
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        
        for (int c = 0; c < n; ++c) {
            int[] col = new int[n];
            for (int r = 0; r < n; ++r) {
                col[r] = grid[r][c];
            }
            res += hm.getOrDefault(Arrays.toString(col), 0);
        }
        return res;  
    }
}