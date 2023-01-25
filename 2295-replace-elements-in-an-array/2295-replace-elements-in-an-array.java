class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int m = operations.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i+=1){
            map.put(nums[i],i);
        }
        for(int i=0;i<m;i+=1){
            int pos=map.get(operations[i][0]);
            nums[pos]=operations[i][1];
            map.put(operations[i][1],pos);
        }
        return nums;
    }
}