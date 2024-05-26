class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long res=0;
        
        Map<Integer,Integer> map = new HashMap<>();
        // int i=1;
        for(int num:nums1){
            for(int i=1;i<=Math.sqrt(num);i+=1){
                if(i * i == num){
                     map.put(i,map.getOrDefault(i,0)+1);
                }else if(num % i == 0){
                    map.put(i,map.getOrDefault(i,0)+1);
                    map.put(num/i,map.getOrDefault(num/i,0)+1);
                }
            //https://leetcode.com/problems/find-the-number-of-good-pairs-ii/discuss/5208957/C%2B%2B-or-Full-Explanation-or-Easy-to-understand
            }
        }
        
        for(int num:nums2){
            if(map.get(num*k)!=null){
                res+= map.get(num*k);
            }
        }
        return res;
    }
}