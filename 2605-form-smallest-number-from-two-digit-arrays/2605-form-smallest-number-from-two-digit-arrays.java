class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> s1 = getHashSet(nums1), s2 = getHashSet(nums2);
        s1.retainAll(s2);
        if (!s1.isEmpty()) {
            return s1.stream().mapToInt(i -> i).min().getAsInt();
        }
        int a = IntStream.of(nums1).min().getAsInt();
        int b = IntStream.of(nums2).min().getAsInt();
        return Math.min(a, b) * 10 + Math.max(a, b);
    }
    private HashSet<Integer> getHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set;
    }
}