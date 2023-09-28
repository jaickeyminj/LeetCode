class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        int k=nums.length-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[j]%2!=0&& nums[k]%2==0 && k>j){
                int temp = nums[j];
                nums[j]= nums[k];
                nums[k]= temp;
                k--;
                j++;
                // System.out.println(Arrays.toString(nums));
            }else if(nums[j]%2==0){
                j++;
            }
            else if(nums[k]%2!=0){
                k--;
            }
        }
        return nums;
    }
}