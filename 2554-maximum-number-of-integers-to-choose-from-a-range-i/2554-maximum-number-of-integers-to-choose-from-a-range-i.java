class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] avail = new boolean[n+1]; 
        Arrays.fill(avail, true); 
        for (int x : banned) 
            if (x <= n) avail[x] = false; 
        int ans = 0; 
        for (int x = 1; x <= n; ++x) 
            if (avail[x]) {
                maxSum -= x; 
                if (maxSum < 0) break; 
                ++ans; 
            }
        return ans; 
    }
}