class Solution {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
		int[] dp = new int[n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[src] = 0;
		while (k-- >= 0) {
			if (this.isExistsRoute(flights, dp)) {
				break;
			}
		}
		return dp[dst] == Integer.MAX_VALUE ? -1 : dp[dst];
	}

	private boolean isExistsRoute(int[][] flights, int[] dp) {
		int[] temp = Arrays.copyOf(dp, dp.length);
		boolean result = true;
		for (int[] flight : flights) {
			int src = flight[0];
			int dst = flight[1];
			int cost = flight[2];
			if (temp[src] < Integer.MAX_VALUE && dp[dst] > dp[src] + cost) {
				dp[dst] = temp[src] + cost;
				result = false;
			}
		}
		return result;
	}
}