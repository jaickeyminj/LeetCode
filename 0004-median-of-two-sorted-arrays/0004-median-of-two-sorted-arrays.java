class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int prev = 0;
        int cur = 0;
        int len = nums1.length + nums2.length;
        int cnt = len / 2 + 1;
        int i,j;
        i=j=0;
        
        while(i<nums1.length && j<nums2.length && cnt>0){
            prev = cur;
            if(nums1[i]<=nums2[j]){
                cur = nums1[i];
                i+=1;
            }
            else{
                cur = nums2[j];
                j+=1;
            }
            cnt-=1;
        }
        while(i<nums1.length && cnt>0){
            prev = cur;
            cur = nums1[i];
            cnt-=1;
            i+=1;
        }
        while(j<nums2.length && cnt>0){
            prev = cur;
            cur = nums2[j];
            cnt-=1;
            j+=1;
        }
        if(len%2 == 0)
            return (prev + cur)/ 2.0;
        else
            return cur ;
    }
}