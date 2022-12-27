class Solution {
    // public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
    //     final int n = rocks.length;
    //     int cnt =0;
    //     int[] remainingCapacity = new int[n];
    //     for (int i = 0; i < n; ++i)
    //         remainingCapacity[i] = capacity[i] - rocks[i];
    //     Arrays.sort(remainingCapacity);
    //     for (int i = 0; i < n; ++i) {
    //         if (additionalRocks >= remainingCapacity[i]) {
    //             additionalRocks -= remainingCapacity[i];
    //             cnt+=1;
    //         }
    //         else
    //             break;
    //     }
    //     return cnt;
    // }
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<rocks.length; i++){
            list.add(capacity[i]-rocks[i]);
        }
        Collections.sort(list);
        int ans=0,count=0;
        for(int a:list){
            count += a;
            if(count > additionalRocks) break;
            ans++;
        }
        return ans;
    }
}