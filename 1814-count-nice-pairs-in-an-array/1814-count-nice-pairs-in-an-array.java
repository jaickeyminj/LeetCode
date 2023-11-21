class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int rev = reverse(nums[i]);
            int dif = nums[i]-rev;
            map.put(dif, map.getOrDefault(dif, 0)+1);
        }
        long res=0, m=1000000007;
        for(int ct : map.values()) {
            if(ct == 1) continue;
            res = (res + (long) ct * (ct-1)/2) % m;
        }
        return (int)res;
    }
    
    private int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}