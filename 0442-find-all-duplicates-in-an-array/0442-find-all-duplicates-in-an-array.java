class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){  
            int index =Math.abs(nums[i]);  
            if(nums[index-1] >0){ 
                nums[index-1] = - nums[index-1];
            }
            else{
                res.add(Math.abs(nums[i])); 
            }
    }
        return res;
    }
}