class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int v : nums1){
            if(Arrays.binarySearch(nums2, v) >= 0){
                return v;
            }
        }
        return -1;
    }
}