class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int max = 0;
        for(int num : nums) {
            freq[num]++;
            max = Math.max(max,freq[num]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < max;i++) ans.add(new ArrayList<>());
        for(int i = 0;i <= n;i++){
            while(freq[i]-- > 0){
                ans.get(freq[i]).add(i);
            }
        }
        return ans;
    }
}