class Solution {
//     public int kthSmallest(int[][] matrix, int k) {
//         int low = matrix[0][0];
//         int high = matrix[matrix.length-1][matrix[0].length-1];
//         while(low<=high){
//             int mid=  (high+low)>>1;
//             if(abc(matrix,mid)<k){
//                 low=mid+1;
//             }else{
//                 high=mid-1;
//             }
//         }
//         return low;
//     }
    
//     public int abc(int matrix[][],int a){
//         int count = 0,  j = matrix[0].length - 1;
//         for(int i = 0; i < matrix.length; i++) {
//             while(j >= 0 && matrix[i][j] > a) j--;
//                 count += (j + 1);
//         }
//         return count;
//     }
    
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int a[]: matrix){
            for(int i:a){
                pq.offer(i);
                if(pq.size()>k)
                    pq.poll();
            }
        }
        
//         while(k>1){
//             pq.poll();
//             k-=1;
//         }
        return pq.poll();
    }
    
}