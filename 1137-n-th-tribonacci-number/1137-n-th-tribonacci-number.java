class Solution {
    public int tribonacci(int n) {
        if(n == 0) {
            return 0;
        }
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        
        for(int i = 3; i <= n; i++) {
            int temp = t2;
            t2 += t0 + t1;
            t0 = t1;
            t1 = temp;
        }
        return t2;
    }
}