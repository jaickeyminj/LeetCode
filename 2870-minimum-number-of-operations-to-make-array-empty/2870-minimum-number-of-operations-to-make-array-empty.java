class Solution {
   public int minOperations(int[] nums) {
   	Map<Integer, Integer> count = new HashMap<>();

   	for (int num : nums) {
   		count.put(num, count.getOrDefault(num, 0) + 1);
   	}

   	int ans = 0;
   	for (Integer v : count.values()) {
        if(v==1) return -1;
   		if(v%3 == 0)
            ans += v/3;
        else
            ans += v/3 + 1;
   	}

   	return ans;
   }
}