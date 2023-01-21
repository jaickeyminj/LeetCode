class Solution {
    public int search(int[] nums, int target) {
        int low =0;
        int high = nums.length - 1;
        
        for(; low<=high;){
            int mid = (low+high) >> 1;
            
            if(nums[mid]>target){
                high = mid -1;
                
            }
            else if(nums[mid]<target){
                low = mid +1;
            }
            else if(nums[mid]== target){
                return mid;
            }
        }
        return -1;
    }
}