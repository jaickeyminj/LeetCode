class Solution {
   public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long total = 0;
        for (int num : nums) {
            total += num;
        }
        
        long totalDiff = 0;
        int positiveCount = 0;
        int minAbsDiff = Integer.MAX_VALUE;
        
        for (int num : nums) {
            int diff = (num ^ k) - num;
            
            if (diff > 0) {
                totalDiff += diff;
                positiveCount += 1;
            }
            minAbsDiff = Math.min(minAbsDiff, Math.abs(diff));
        }
        
        if (positiveCount % 2 == 1) {
            totalDiff -= minAbsDiff;
        }
        
        return total + totalDiff;
    }
}