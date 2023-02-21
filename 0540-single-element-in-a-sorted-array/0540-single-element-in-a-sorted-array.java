class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         Map<Integer,Integer> map = new HashMap<>();
        
//         for(int i:nums){
//             map.put(i,map.getOrDefault(i,0)+1);
//         }
        
//         for(Map.Entry<Integer,Integer> m: map.entrySet()){
//             if(m.getValue()==1)
//                 return m.getKey();
//         }
//         return -1;
//     }
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) ||
               (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
}