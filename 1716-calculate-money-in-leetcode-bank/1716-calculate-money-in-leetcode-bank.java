class Solution {
//     public int totalMoney(int n) {
//         int monday = 1, cur = 1, bank = 0;
//         for(int i = 1; i <= n; i++) {
//                 bank += cur;
//                 cur++;
//             if (i % 7 == 0) {
//                 monday+=1;
//                 cur = monday;
//             }
            
//         }
//         return bank;
//     }
    public int totalMoney(int n) {
        int fullWeek = n/7;
        int res = 0;
        for(int i=1;i<=fullWeek;i++){
            res+= 7*(i+3);
        }
        
        for(int i=7*fullWeek; i<n;i++){
            fullWeek+=1;
            res+=fullWeek;
        }
        return res;
    }
}