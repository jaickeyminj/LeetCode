class Solution {
    // public int minimumCost(int[] cost) {
    //     final int len = cost.length;
    //     if(len==1)
    //         return cost[0];
    //     if(len==2)
    //         return cost[0]+cost[1];
    //     else{
    //         int sum =0;
    //         Arrays.sort(cost);
    //         int i = len-1;
    //         for(;i>=1;i-=3){
    //             sum += cost[i]+cost[i-1];
    //         }
    //         if(i==0)
    //             return sum+cost[0];
    //         return sum;
    //     }
    // }
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int sum=0;
        for(int i=0;i<n;i+=1){
            if(i%3!=n%3)
                sum+=cost[i];
        }
        return sum;
    }
}