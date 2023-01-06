class Solution {
    public int minimumCost(int[] cost) {
        final int len = cost.length;
        if(len==1)
            return cost[0];
        if(len==2)
            return cost[0]+cost[1];
        else{
            int sum =0;
            Arrays.sort(cost);
            int i = len-1;
            for(;i>=1;i-=3){
                sum += cost[i]+cost[i-1];
            }
            if(i==0)
                return sum+cost[0];
            return sum;
        }
    }
}