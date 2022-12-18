class Solution {
    public int smallestValue(int n) {
        while (true) {
			int s = 0; 
			for (int f = 2, x = n; f <= x; ++f)
				for (; x % f == 0; x /= f)
					s += f; 
			if (s == n) break; 
			n = s; 
		}
		return n; 
    }
}