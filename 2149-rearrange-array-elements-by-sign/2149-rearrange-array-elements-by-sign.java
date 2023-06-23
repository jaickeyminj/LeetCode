class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a[]= new int[nums.length/2];
        int b[]= new int[a.length];
        int ii=0;
        int j=0;
        for(int k: nums){
            if(k<0) b[j++]=k;
            else a[ii++]=k;
        }
        j=0;
        for(int i=0;i<nums.length;i+=2){
            nums[i]=a[j];
            nums[i+1]=b[j];
            j+=1;
        }
        
        return nums;
    }
}