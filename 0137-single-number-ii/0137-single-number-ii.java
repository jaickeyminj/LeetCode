class Solution {
    public int singleNumber(int[] nums) {
        int val =0;
        
        for(int i=0;i<32;i+=1){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if((nums[j]&(1<<i))!=0){
                    count+=1;
                }
            }
            if(count%3==1)
                val+=1<<i;
        }
        return val;
    }
}