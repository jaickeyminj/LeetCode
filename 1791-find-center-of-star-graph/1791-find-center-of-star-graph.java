// class Solution {
//     public int findCenter(int[][] edges) {
//         int V = (int)10e5;
//         List<List<Integer>> am = new ArrayList<>();
//         int maxi = 0;
//         for(int e[]:edges){
//             maxi = Math.max(maxi,Math.max(e[0],e[1]));
//         }
//         V= maxi+1;
//         for(int i=0;i<V;i+=1){
//             am.add(new ArrayList<Integer>());
//         }
//         for(int e[]:edges){
//             addEdge(am,e[0],e[1]);
//         }
//         for(int i=0;i<V;i+=1){
//             if(maxi-1 == am.get(i).size()){
//                 return i;
//             }
//         }
//         return -1;
//     }
    
//     public void addEdge(List<List<Integer>> am, int s, int d) {
//         am.get(s).add(d);
//         am.get(d).add(s);
//     }
// }

class Solution {
    public int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else {
            return edges[0][1];
        }
    }
}