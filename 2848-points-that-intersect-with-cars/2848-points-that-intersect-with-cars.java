class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] v = new int[102];
        int ans = 0;
        for(List<Integer> n: nums){ 
            for(int i = n.get(0); i <= n.get(1); ++i) v[i-1]++; 
        }
        for(int i = 0; i <= 100; ++i){
            if(v[i] != 0) ans++;
        }
        return ans;
    }
}