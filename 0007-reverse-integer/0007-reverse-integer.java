class Solution {
    public int reverse(int x) {
        long res=0;
        int i=0;
        if(x<0){
            x*=-1;
            i=-1;
        }
        while(x>0){
            res = res*10 + x%10;
            if( res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
            x= x/10;
        }
        return i==0?(int)res:(int)res*-1;
    }
}