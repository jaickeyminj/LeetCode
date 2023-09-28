class Solution {
//     public int jump(int[] nums) {
//         // The starting range of the first jump is [0, 0]
//         int answer = 0, n = nums.length;
//         int curEnd = 0, curFar = 0;
        
//         for (int i = 0; i < n - 1; ++i) {
//             // Update the farthest reachable index of this jump.
//             curFar = Math.max(curFar, i + nums[i]);

//             // If we finish the starting range of this jump,
//             // Move on to the starting range of the next jump.
//             if (i == curEnd) {
//                 answer++;
//                 curEnd = curFar;
//             }
//         }
        
//         return answer;
//     }
    public int jump(int[] nums) {
        int max = 0;
        int end = -1;
        int cnt = 0;
        
        for(int i=0;i<nums.length-1;i+=1){
            if(i>end){
                cnt+=1;
                end = max;
            }
            max = Math.max(max,nums[i]+i);
            if(max>=nums.length-1) return cnt;
        }
        return cnt;
    }
}