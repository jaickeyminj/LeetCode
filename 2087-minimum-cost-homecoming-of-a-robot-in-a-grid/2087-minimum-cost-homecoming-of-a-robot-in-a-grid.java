class Solution {
//     public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
//         int ans = 0;
        
//         int i = homePos[0];
//         int j = homePos[1];
        
//         while(i != startPos[0]){
//             ans+= rowCosts[i];
//             if(startPos[0]<i){
//                 i-=1;
//             }
//             else{
//                 i+=1;
//             }
//         }
        
//         while(j != startPos[1]){
//             ans+=colCosts[j];
//             if(startPos[1]<j){
//                 j-=1;
//             }
//             else{
//                 j+=1;
//             }
//         }
//         return ans;
//     }
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int startX = startPos[0];
        int startY = startPos[1];
        int endX = homePos[0];
        int endY = homePos[1];
        int res = 0;
        if(startX>endX){
            for(int i= startX-1; i>=endX; i-=1){
                res+= rowCosts[i];
            }
        }else{
            for(int i= startX+1; i<=endX; i+=1){
                res+= rowCosts[i];
            }
        }
        
        if(startY>endY){
            for(int i=startY-1;i>=endY; i-=1){
                res+= colCosts[i];
            }
        }
        else{
            for(int i=startY+1;i<=endY; i+=1){
                res+= colCosts[i];
            }
        }
        return res;
    }
}