class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        if(num%10==0) return false;
        int temp = reverseFun(num);
        // int rev =0;
        // while(temp>0){
        //     rev = rev*10 + temp%10;
        //     temp/=10;
        // }
        int rev = reverseFun(temp);
        // rev=0;
        // while(temp>0){
        //     rev = rev*10+ temp%10;
        //     temp/=10;
        // }
        return rev==num;
    }
    
    public int reverseFun(int num){
        int temp = num;
        int rev =0;
        while(temp>0){
            rev = rev*10 + temp%10;
            temp/=10;
        }
        return rev;
    }
}