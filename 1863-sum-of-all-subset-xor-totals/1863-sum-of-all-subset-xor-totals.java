class Solution {
    public int subsetXORSum(int[] nums) {
        return genSubsets(0,0,nums.length,nums);
    }
    
    public int genSubsets(int ans,int i,int n,int a[]){
        if(i==n)
            return ans;
        int x = genSubsets(ans^a[i],i+1,n,a);
        int b = genSubsets(ans,i+1,n,a);
        return x + b;
    }
    // public int subsetXORSum(int[] nums) {
    //     int ans =0;
    //     int n = nums.length;
    //     for(int i=0;i<(1<<n);i+=1){
    //         int c =0;
    //         for(int j=0;j<n;j+=1){
    //             if((i&(1<<j))!=0){
    //                 c^=nums[j];
    //             }
    //         }
    //         ans+=c;
    //     }
    //     return ans;
    // }
}