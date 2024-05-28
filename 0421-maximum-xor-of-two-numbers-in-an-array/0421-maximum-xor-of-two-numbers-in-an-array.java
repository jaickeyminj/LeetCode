class Solution {
    public int findMaximumXOR(int[] nums) {
        Set<Integer> set;
        
        int mask =0, ans=0;
        int j=31;
        for(int i=31;i>=0;i--){
            mask = mask |(1<<i);
            set = new HashSet<>();
            for(int n:nums){
                set.add(n&mask);
            }
            int temp = ans | (1<<i);
        
            for(int n: set){
                if(set.contains(n^temp)){
                    ans = temp;
                    break;
                }
            }
        }
        
       
        return ans;
    }
}