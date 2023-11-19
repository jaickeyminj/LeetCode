class Solution {
    
    public int reductionOperations(int[] nums) {
        int[] count = new int[5 * 10000 + 1];
        for (int num : nums) {
            count[num]++;
        }

        int sum = 0;
        int distinctCount = 0;
        for (int numCount : count) {
            if (numCount != 0) {
                sum += distinctCount * numCount;
                distinctCount++;
            }
        }

        return sum;
    }
}

/*class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int res = 0;
        for(int i=0;i<nums.length-1;i+=1){
            if(nums[i]!=nums[i+1]){
                cnt+=1;
            }
            res +=cnt;
        }
        return res;
    }
}*/