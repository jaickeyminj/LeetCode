class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index =0;
        int n = gas.length;
        int curr=0;
        int total =0;
        for(int i=0;i<n;i+=1){
            total += gas[i]-cost[i];
            curr += gas[i]-cost[i];
            if(curr<0){
                index = i+1;
                curr = 0;
            }
        }
        return total>=0?index:-1;
    }
}