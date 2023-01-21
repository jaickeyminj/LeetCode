class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        
        while(low <= high){
            int mid = (low+ (high-low)/2);
            if(Math.pow(mid,2)>x){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return high;
    }
}