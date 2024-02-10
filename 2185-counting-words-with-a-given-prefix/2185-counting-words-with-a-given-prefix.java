class Solution {
    public int prefixCount(String[] words, String pref) {
        return (int)Stream.of(words).filter(w -> w.startsWith(pref)).count();
    }
}