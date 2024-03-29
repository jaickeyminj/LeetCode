class Solution {
    // public int firstMissingPositive(int[] nums) {
    //     Map<Integer,Integer> map = new HashMap<>();
    //     int i =1;
    //     for (int j:nums){
    //         map.put(j,map.getOrDefault(j,0));
    //     }
    //     for(int j: nums){
    //         if(!map.containsKey(i)){
    //             return i;
    //         }
    //         i+=1;
    //     }
    //     return i;
    // }
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while( i < nums.length){
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]){
                swap(nums,i,nums[i] - 1);
            }else{
                i++;
            }
        }
        for(i = 0;i<nums.length;i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}