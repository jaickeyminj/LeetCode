class Solution {
    public int subarraysDivByK(int[] nums, int k) {
//         int n=arr.length;
//         long sum=0;
//         int cnt=0;
//         for (int i=0; i <n; i++){
//             for (int j=i; j<n; j++){
//                 sum=0;
//                 for (int k=i; k<=j; k++){
//                     sum+=arr[k];
//                 }
//                 if(sum%K==0)
//                     cnt++;
//             }
//         }
        
//         return cnt;
        int [] remainderArray = new int[k];
        remainderArray[0] = 1;
        int sum = 0, count = 0;
        for(int a : nums){
            sum = (sum + a) % k;
            if(sum < 0) sum += k;
            count += remainderArray[sum];
            remainderArray[sum]++;
        }
        return count;
    }
}