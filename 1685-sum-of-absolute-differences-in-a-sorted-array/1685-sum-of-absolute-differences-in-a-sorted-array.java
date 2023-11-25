class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=1; i<nums.length; ans[0]+=nums[i++]-nums[0]){}
        for(int i=1; i<nums.length; ++i) {
            ans[i]=ans[i-1]+(i+i-nums.length)*(nums[i]-nums[i-1]);
        }  
        
        return ans;
    }
}