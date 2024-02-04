class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0, displacement = 0;
        for (int num: nums) {
            displacement += num;
            if (displacement == 0)
                count++;
        }
        return count;
    }
}