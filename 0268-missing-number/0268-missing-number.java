// class Solution {
//     public int missingNumber(int[] nums) {
//         int sum1=0;
//         int sum2=0;
//         int k=1;
//         for(int i:nums){
//             sum1+=i;
//             sum2+=k;
//             k++;
//         }
//         return sum2-sum1;
//     }
// }
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int correctIdx = nums[i];
            if (nums[i] < n && nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
            else i++;
        }

        for (int j = 0; j < n; j++) {
            if (j != nums[j]) {
                return j;
            }
        }

        return n;
    }
}