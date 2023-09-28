class Solution {
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0)
            return true;
        else{
            return tryReach(arr,start);
        }
    }
    
    public boolean tryReach(int arr[],int start){
        if(arr[start]==-1)
            return false;
        if(arr[start]==0)
            return true;
        int left = start - arr[start];
        int right = start + arr[start];
        arr[start] =-1;
        
        return (left>=0 && tryReach(arr,left)) || (right<arr.length && tryReach(arr,right));
    }
}