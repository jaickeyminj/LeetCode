class Solution {
    public int[] sortByBits(int[] arr) {
        // for(int i=0; i<arr.length;i+=1){
        //     arr[i] += countSetBits(arr[i]) * 10001;
        // }
        for(int i=0; i<arr.length;i+=1){
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i+=1){
            arr[i] %=  10001;
        }
        return arr;
    }
    private static int countSetBits(int N){
        int count = 0;
        for (int i = 0; i < 4 * 8; i++){
            if ((N & (1 << i)) != 0)
                count++;
        }
        return count;
  }
}