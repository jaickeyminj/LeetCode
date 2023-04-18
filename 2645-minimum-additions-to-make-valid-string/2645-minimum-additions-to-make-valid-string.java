class Solution {
    public int addMinimum(String word) {
        int k = 0, prev = 'z', n = word.length();
        for (int i = 0; i < n; ++i) {
            k += word.charAt(i) <= prev ? 1 : 0;
            prev = word.charAt(i);
        }
        return k * 3 - n;
    }
}