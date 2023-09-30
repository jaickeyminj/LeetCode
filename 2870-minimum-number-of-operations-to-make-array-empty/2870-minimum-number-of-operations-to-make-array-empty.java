class Solution {
   public int minOperations(int[] nums) {
   	Map<Integer, Integer> count = new HashMap<>();

   	for (int num : nums) {
   		count.put(num, count.getOrDefault(num, 0) + 1);
   	}

   	int result = 0;
   	for (Integer value : count.values()) {
   		if (value == 1) return -1;

   		result += value / 3;
   		if (value % 3 != 0) result+=1;
   	}

   	return result;
   }
}