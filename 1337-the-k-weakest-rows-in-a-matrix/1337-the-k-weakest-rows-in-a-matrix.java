class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];

        int[] counts = new int[mat.length];
        for (int i = 0; i < mat.length; i+=1) {
            for (int j = 0; j < mat[0].length; j+=1) {
                if (mat[i][j] == 1) {
                    counts[i]++;
                }
                else break;
            }
        }

        int j = 0;
        while (k > 0) {
            
            int minIndex = 0;
            for (int i = 0; i < counts.length; i+=1) {
                if (counts[i] < counts[minIndex]) {
                    minIndex = i;
                }
            }

            result[j] = minIndex;
            j+=1;
            counts[minIndex] = Integer.MAX_VALUE;
            k-=1;
        }

        return result;
    }
}