class Solution {

    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        int max = 0;
        int minIncrements = 0;

        for (int val : nums) {
            max = Math.max(max, val);
        }
        int[] frequencyCount = new int[n + max];

        for (int val : nums) {
            frequencyCount[val]++;
        }
        for (int i = 0; i < frequencyCount.length; i++) {
            if (frequencyCount[i] <= 1) continue;

            int duplicates = frequencyCount[i] - 1;
            frequencyCount[i + 1] += duplicates;
            frequencyCount[i] = 1;
            minIncrements += duplicates;
        }

        return minIncrements;
    }
}