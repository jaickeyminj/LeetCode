class Solution {
    // public boolean containsDuplicate(int[] nums) {
    //     // Arrays.sort(nums);
    //     // // System.out.println(Arrays.toString(nums));
    //     // for(int i=0;i<nums.length-1;i++){
    //     //     // System.out.println(nums[i]+" "+nums[i+1]);
    //     //     if(nums[i]==nums[i+1]) return true;
    //     // }
    //     // return false;
    //     Set<Integer> set = new TreeSet<>();
    //     for(int i: nums){
    //         if(set.contains(i)) return true;
    //         set.add(i);
    //     }
    //     return false;
    // }
    public boolean containsDuplicate(int[] nums) {
        return nums.length != Arrays.stream(nums).parallel().distinct().count();
    }
}