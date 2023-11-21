class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int rev=Integer.parseInt(new StringBuilder(nums[i]+"").reverse().toString());
            int dif=nums[i]-rev;
            map.put(dif, map.getOrDefault(dif, 0)+1);
        }
        long res=0, m=1000000007;
        for(int ct : map.values()) {
            if(ct==1) continue;
            res=(res+(long)ct*(ct-1)/2)%m;
        }
        return (int)res;
    }
}