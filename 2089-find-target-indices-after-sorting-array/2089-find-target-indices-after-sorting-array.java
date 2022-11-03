class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        // List<Integer> list = new ArrayList<Integer>();
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         list.add(i);
        //     }
        // }
        // return list;
        int count = 0, lessthan = 0;
        for (int n : nums) {
            if (n == target) count++;
            if (n < target) lessthan++;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessthan++);
        }
        return result;
    }
}