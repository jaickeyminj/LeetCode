class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballsMap = new HashMap<>();
        Map<Integer, Integer> countsColorsMap = new HashMap<>();
        int count = 0;
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int x = query[0];
            int y = query[1];
            if (ballsMap.containsKey(x)) {
                int oldColor = ballsMap.get(x);
                if (countsColorsMap.get(oldColor) == 1) {
                    countsColorsMap.remove(oldColor);
                } else {
                    countsColorsMap.put(oldColor, countsColorsMap.get(oldColor) - 1);
                }
            }
            ballsMap.put(x, y);
            countsColorsMap.put(y, countsColorsMap.getOrDefault(y, 0) + 1);
            result[count] = countsColorsMap.size();
            count = count + 1;
        }
        return result;
    }
}