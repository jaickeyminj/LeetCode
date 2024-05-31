class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for(int i=0;i<nums.length;i+=1){
            x=x^nums[i];
        }
        int a =0;
        int b =0;
        int bit =0;
        while(x!=0){
            if((x&1)!=0){
                break;
                // break;
            }
            bit+=1;
            x= x>>1;
        }
        for(int i:nums){
            if((i&(1<<bit))!=0){
                a=a^i;
            }
            else{
                b=b^i;
            }
            
        }
        
        return new int[]{a,b};
    }
}