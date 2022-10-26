class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0))
            return false;
        // if(x>=0&&x<=9)
        //     return true;
        int rev=x;
        int sum=0;
        
        while(x>sum){
            sum = sum*10 + x%10;
            x = x/10;
        }
        // System.out.print(rev+" "+sum +" "+ x);
        
        return x == sum/10 || x==sum;
    }
}