class Solution {
    //https://www.youtube.com/watch?v=cOFAmaMBVps
//     public int singleNumber(int[] nums) {
//         int val =0;
        
//         for(int i=0;i<32;i+=1){
//             int count =0;
//             for(int j=0;j<nums.length;j++){
//                 if((nums[j]&(1<<i))!=0){
//                     count+=1;
//                 }
//             }
//             if(count%3==1)
//                 val+=1<<i;
//         }
//         return val;
//     }
    public int singleNumber(int[] nums) {
        int ones=0;
        int two=0;
        
        for(int i:nums){
            ones = ones^ i;
            ones = ones& ~two;
            two = i^two;
            two = two & ~ones;
        }
        return ones;
    }
}