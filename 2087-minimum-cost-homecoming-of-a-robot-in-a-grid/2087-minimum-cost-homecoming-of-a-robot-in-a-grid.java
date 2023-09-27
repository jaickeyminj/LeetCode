class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int ans = 0;
        
        int i = homePos[0];
        int j = homePos[1];
        
        while(i != startPos[0]){
            ans+= rowCosts[i];
            if(startPos[0]<i){
                i-=1;
            }
            else{
                i+=1;
            }
        }
        
        while(j != startPos[1]){
            ans+=colCosts[j];
            if(startPos[1]<j){
                j-=1;
            }
            else{
                j+=1;
            }
        }
        return ans;
    }
}