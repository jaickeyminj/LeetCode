class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n[] = new int[nums.length*nums.length];
        
        int i=0;
        
        for(int a:nums){
            for(int b: nums){
                if(Math.abs(a-b)<=Math.min(a,b)){
                    n[i]=a^b;
                    i+=1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int j:n){
            max = Math.max(max,j);
        }
        
        return max;
    }
}