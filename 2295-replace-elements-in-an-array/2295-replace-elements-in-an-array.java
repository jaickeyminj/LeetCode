class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int[] map = new int[1000001];
        int i=0; 
        for(int x:nums){
            map[x]=i;
            i+=1;
        }

        for(int[] x : operations)
        {
            int idx = map[x[0]];
            nums[idx]=x[1];
            map[x[1]]=idx;
        }
        return nums;
    }
}