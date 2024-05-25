class Solution {
    public int reverse(int x) {
        long rev = 0;
        if(x==0)
            return 0;
        int xx=x;
        if(x<0) x*=-1;
        while(x>0){
            rev = rev*10 + x%10;
            if(rev>Integer.MAX_VALUE || rev< Integer.MIN_VALUE){
                //System.out.println(rev);
                return 0;
            }
                //return 0;
            x/=10;
        }
        
        return xx<0?(int)rev*-1:(int)rev;
    }
}