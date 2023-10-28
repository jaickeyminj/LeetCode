class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//          int i = 0, j = matrix[0].length - 1;
//             while (i < matrix.length && j >= 0) {
//                     if (matrix[i][j] == target) {
//                         return true;
//                     } else if (matrix[i][j] > target) {
//                         j--;
//                     } else {
//                         i++;
//                     }
//                 }
            
//             return false;
//     }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length-1;
        int index = 0;
        while(start<=end){
            int mid = (start+end)>>1;
            if(matrix[mid][0]==target)
                return true;
            if(matrix[mid][0]<target){
                index = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return Arrays.binarySearch(matrix[index],target)>=0;
    }
}