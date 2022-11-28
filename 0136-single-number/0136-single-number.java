class Solution {
    public int singleNumber(int[] nums) {
        int i=0;
        for(int ii:nums){
            i=i^ii;
        }
        return i;
    }
}