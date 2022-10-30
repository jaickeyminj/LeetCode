class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i:nums){
            if(i%2==0 && i%3==0){
                sum+=i;
                count+=1;
            }
        }
        if(count!=0)
            return sum/count;
        return 0;
    }
}