class Solution {
    public int kthGrammar(int n, int K) {
        return Integer.bitCount(K-1) & 1;
    }
}