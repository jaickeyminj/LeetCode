class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length;
        if(len==1 && nums[0]==0) return 0;
        if(len==1 && nums[0]>0) return 1;
        
        int map[]= new int[101];
        for(int i: nums){
            map[i]=1;
        }
        int cnt=0;
        for(int i=1;i<map.length;i+=1){
            if(map[i]==1) cnt+=1;
        }
        return cnt;
    }
}