// class Solution {
//     public int getWinner(int[] arr, int k) {
//         if(k>arr.length){
//             int max = Integer.MIN_VALUE;
//             for(int i: arr){
//                 max = Math.max(max,i);
//             }
//             return max;
//         }
//         else{
//             Map<Integer,Integer> hm = new HashMap<>();
            
//             int a = arr[0];
//             int b = arr[1];
            
//             if(arr.length==2)
//                 return Math.max(a,b);
//             int winner = Math.max(a,b);
//             hm.put(winner,hm.getOrDefault(winner,0)+1);
//             if(hm.get(winner)==k)
//                     return winner;
//             for(int i=2;i<arr.length;i+=1){
//                 a = winner;
//                 b = arr[i];
//                 winner = Math.max(a,b);
//                 hm.put(winner,hm.getOrDefault(winner,0)+1);
//                 if(hm.get(winner)==k)
//                     return winner;
//             }
//             System.out.println(hm);
//             return winner;
//         }
//     }
// }

class Solution {
    public int getWinner(int[] arr, int k) {
        int win=0;
        int ele=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>ele){
                win=0;
                ele=arr[i];
            }
            if(++win==k){
               break;
            }
        }
        return ele;
    }
}