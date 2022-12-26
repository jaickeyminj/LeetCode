class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)
            return true;
        int canJumpTill = 0, len = nums.length - 1;
        for(int i = 0; i < len; i++) {
            if(i + nums[i] > canJumpTill)
                canJumpTill = i + nums[i];
            if(canJumpTill >= len) 
                return true;			
            if(canJumpTill <= i) 
                return false;
        }
		
		return false;
    }
}