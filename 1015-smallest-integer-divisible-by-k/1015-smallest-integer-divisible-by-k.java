class Solution {
    public int smallestRepunitDivByK(int K) {
        if(K%2==0||K%5==0) return -1;
        int remainder = 1;
        for (int i = 1; i<= K; i+=1) {
            
            if (remainder%K == 0) {
                return i;
            }
            remainder = (remainder * 10 + 1)%K;
        }
        return -1;  
    }
}