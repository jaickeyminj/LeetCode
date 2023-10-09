class Solution {
    public int[] searchRange(int[] nums, int target) {
         
        int res[]= new int[2];
        res[0]= findLast(nums,target);
        res[1]= findFirst(nums,target);    
        return res;
    }
    
    public int findFirst(int n[],int key){
        
        int ans=-1;
        int low =0;
        int high = n.length-1;
        while(low<=high){
            int mid = (low+high)>>1;
            if(n[mid]<= key){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
            if(n[mid]==key) ans = mid;
        }
        
        return ans;
        
    }
    
    
    public int findLast(int n[], int key){
        int ans=-1;
        int low =0;
        int high = n.length-1;
        while(low<=high){
            int mid = (low+high)>>1;
            if(n[mid]>= key){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
            if(n[mid]==key) ans = mid;
        }
        
        return ans;
        
    }
    
}