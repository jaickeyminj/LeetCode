class Solution {
    /*public int maximumStrongPairXor(int[] nums) {
        // int n[] = new int[nums.length*nums.length];
        
        // int i=0;
        int max = Integer.MIN_VALUE;
        for(int a:nums){
            for(int b: nums){
                if(Math.abs(a-b)<=Math.min(a,b)){
                    max = Math.max(a^b,max);
                    // i+=1;
                }
            }
        }
        return max;
    }*/
    
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int x = nums[i] ^ nums[j];
                if (x > max && Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    max = x;
                }
            }
        }
        return max;
    }
}