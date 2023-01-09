class Solution {
    public int mostFrequent(int[] nums, int key) {
        int arr[] = new int[1001];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == key){
                arr[nums[i]]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i=0; i<1001; i++){
            if(arr[i] > max){
                max = arr[i];
                res = i;
            }
        }
        return res;
    }
}