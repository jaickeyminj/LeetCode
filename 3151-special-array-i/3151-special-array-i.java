class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1)
            return true;
        int len = nums.length;
        for(int i=1;i<len;i+=1){
            if((nums[i]%2!=0)^(nums[i-1]%2!=0))
                continue;
            else
                return false;
        }
        
        return true;
    }
}