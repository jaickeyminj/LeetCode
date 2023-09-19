class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int x[] = new int[n];
        x[0]=x[1]=1;
        for(int i=2;i<n;i+=1){
            x[i]= x[i-1] + x[i-2];
        }
        return x[n-1];
    }
}