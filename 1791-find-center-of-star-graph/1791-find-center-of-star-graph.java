class Solution {
    public int findCenter(int[][] edges) {
        int V = (int)10e5;
        List<List<Integer>> am = new ArrayList<>();
        int maxi = 0;
        for(int e[]:edges){
            maxi = Math.max(maxi,Math.max(e[0],e[1]));
        }
        V= maxi+1;
        for(int i=0;i<V;i+=1){
            am.add(new ArrayList<Integer>());
        }
        for(int e[]:edges){
            // if(am.get(e[0])==null) am.add(new ArrayList<Integer>());
            // if(am.get(e[1])==null) am.add(new ArrayList<Integer>());
            addEdge(am,e[0],e[1]);
        }
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<V;i+=1){
            max = Math.max(max,am.get(i).size());
        }
        // System.out.println(max);
        for(int i=0;i<V;i+=1){
            if(max == am.get(i).size()){
                return i;
            }
        }
        return -1;
    }
    
    public void addEdge(List<List<Integer>> am, int s, int d) {
        am.get(s).add(d);
        am.get(d).add(s);
    }
}