class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int cnt=0;
        // while(xor != 0){
        //     if(xor%2==1) cnt++;
        //     xor/=2;
        // }
        while(xor!=0){
            cnt++;
            xor=xor & (xor-1);
        }
        return cnt;
    }
}