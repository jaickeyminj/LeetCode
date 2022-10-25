class Solution {
    public void sortColors(int[] A) {
        int low =0;
		int mid =0;
		int high = A.length-1;
		while(mid<=high){
			switch(A[mid]){
				case 0: int temp = A[low];
					A[low]= A[mid];
					A[mid]=temp;
					low++;
					mid++; 
                    break;
				case 1: mid++; 
                    break;
				case 2: int temp1= A[high];
					A[high]= A[mid];
					A[mid]=temp1; 
					high--;
                    break;
			}
		}  
    }
}