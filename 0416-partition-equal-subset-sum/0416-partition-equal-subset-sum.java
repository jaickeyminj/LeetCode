class Solution {
    public boolean canPartition(int[] nums) {
        int sum  = 0;
        for(int i: nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
//         Map<Integer,Integer> map = new HashMap<>();
//         map.put(0,0);
//         for(int i: nums){
//             Map<Integer,Integer> map2 = new HashMap<>(map);
//             for(Integer e : map2.keySet()){
//                 map.put(e+i,0);
                
//             }
//         }
//         return map.containsKey(sum/2);
//         for (let i = 1; i <= A.length; i++) {
//         for (let j = 0; j <= sumA / 2 ; j++) {
//             //I know that i-1>=0 so i dont need an extra check for that
//             if (j - A[i - 1] >= 0){
//                 B[i][j] = B[i - 1][j - A[i - 1]]||B[i - 1][j];
//             }
//             else{
//                 B[i][j] = B[i - 1][j];

//             }
            
//         }
        boolean res[][] = new boolean[nums.length+1][sum/2+1];
        res[0][0]=!false;
        for(int i=1;i<res.length;i+=1){
            for(int j=0;j<sum/2+1;j+=1){
                if(j - nums[i - 1] >= 0){
                   res[i][j] = res[i - 1][j - nums[i - 1]]|res[i - 1][j]; 
                }
                else{
                    res[i][j] = res[i-1][j];
                }
            }
        }
        return res[res.length-1][res[0].length-1];
    }
}