class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0) return 0;
        else{
            
            if(n==1) return 1;
            if(n==2) return 1;
            int res[] = new int[n+1];
            res[0] = 0;
            res[1] = 1;
            int max = Math.max(res[0],res[1]);
            for(int i=1;i<res.length;i+=1){
                if(i*2<=n){
                    res[i*2] = res[i];
                    if(max<res[i*2])
                        max = res[i*2];
                }
                if(i*2+1<=n){
                    res[2 * i + 1] = res[i] + res[i + 1];
                    if(max<res[i*2+1]){
                        max = res[i*2+1];
                    }
                }
            }
            // System.out.println(Arrays.toString(res));
            return max;
            
            // return ;
        }
    }
}