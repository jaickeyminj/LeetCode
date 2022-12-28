// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         List<Integer> list = new ArrayList<>();
        
//         for(int i=0;i<nums.length;i++){
//             int temp = nums[i];
            
//             temp = temp>0 ? temp: temp *-1;
//             if(nums[temp-1]>0){
//                 nums[temp-1] = -1 * nums[temp-1];
//                 // System.out.println(temp+ " "+nums[temp-1]);
//             }
//         }
//         // }System.out.println(Arrays.toString(nums));
//         int j=0;
//         for(int i: nums){
//             if(i>0){
//                 list.add(j+1);
//             }
//             j++;
//         }
//         return list;
//     }
// }
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
            else i++;
        }

        List<Integer> ans = new ArrayList();
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
