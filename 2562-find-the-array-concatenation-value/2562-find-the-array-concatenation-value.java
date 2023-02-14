class Solution {
    public long findTheArrayConcVal(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        
        int startIndex = 0;
        int endIndex = nums.length - 1;
        long sum = 0;
        while(startIndex < endIndex) {
            String firstEle = String.valueOf(nums[startIndex]);
            String lastEle = String.valueOf(nums[endIndex]);
            String concat = firstEle + lastEle;
            int concatValue = Integer.parseInt(concat);
            
            sum += concatValue;
            
            startIndex++;
            endIndex--;
            
            if(startIndex == endIndex) {
                sum += nums[startIndex];
            }
        }
        
        return sum;
    }
}