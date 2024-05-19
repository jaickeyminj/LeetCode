class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int nq = queries.length, n=nums.length;
        int ct[] = new int[n];
        int last = 0;

        for(int i=0; i<n-1; i++){
            boolean flag = nums[i]%2==0;
            boolean flag1 = nums[i+1]%2==0;
            if((flag^flag1) == false) last++;
            ct[i+1] = last;
        }

        boolean res[] = new boolean[nq];
        for(int i=0; i<nq; i++){
            if(ct[queries[i][1]]-ct[queries[i][0]] == 0) res[i] = true;
        }

        return res;
    }
}