class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int cnt =0;
        
        for(int i=0;i<nums1.length;i+=1){
            for(int j=0;j<nums2.length;j+=1){
                if(nums1[i]%(nums2[j]*k)==0)
                    cnt+=1;
            }
        }
        
        return cnt;
    }
}