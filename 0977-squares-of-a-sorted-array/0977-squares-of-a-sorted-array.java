class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int i = 0;
        int n = nums.length;
        int j = n-1;
        
        for(int k = n-1; k>-1; k--){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
              res[k] = Math.abs(nums[j])* Math.abs(nums[j]);
            j--;
            }
            else{
                res[k] = Math.abs(nums[i])* Math.abs(nums[i]);
            i++;
            }
        }
        return res;
    }
}