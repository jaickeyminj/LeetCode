class Solution {
    // public int maxProfit(int[] prices) {
    //     int buy=Integer.MAX_VALUE,sell=0;
    //     for(int i=0;i<prices.length;i++){
    //         buy=Math.min(buy,prices[i]);
    //         sell=Math.max(sell,prices[i]-buy);
    //     }
    //    return sell;
    // }
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
}