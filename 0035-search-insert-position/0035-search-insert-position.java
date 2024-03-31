class Solution {
    public int searchInsert(int[] arr, int key) {
        if(key<arr[0]) return 0;
		if(key>arr[arr.length-1]) return arr.length;
		
		int low = 0;
		int high = arr.length-1;
		// int ans=-1;
		while(low <= high){
			int mid = low + (high-low)/2;
			if(arr[mid] == key ) return mid;
			else if(arr[mid]<key){
				low = mid+1;
				// ans = mid;
			}
			else{
				// ans = mid;
				high = mid -1;
			}
		}
		return high +1;
		
	
    }
}