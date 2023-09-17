class Solution {
    public int countWays(List<Integer> v) {
        int n = v.size();
        Collections.sort(v);
        int ans = 0;
        int c = 0;
        if (c < v.get(0)) {
            ans++;
        }
        for (int i = 0; i < n; i++) {
            c++;
            if (i == n - 1 && c > v.get(i)) {
                ans++;
            } else if (c > v.get(i) && c < v.get(i+1)) {
                ans++;
            }
        }
        return ans;   
    }
}