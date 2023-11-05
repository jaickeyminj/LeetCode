class Solution {
    public int findChampion(int n, int[][] edges) {
        if(n==1&& edges.length==0) return 0;
        int degree[] = new int[n];
        // Arrays.fill(degree,-1);        
        for(int e[]:edges){
            // if(degree[e[1]]==-1)
            //     degree[e[1]]=0;
            degree[e[1]]+=1;
            // if(degree[e[0]]==-1)
            //     degree[e[0]]=0;
        }
        int ans = -1;
        int cnt = 0;
        int k = 0;
        System.out.println(Arrays.toString(degree));
        for(int i: degree){
            // if(i==-1)
            //     continue;
            if(i==0){
                cnt+=1;
                ans = k;
            }
            k+=1;
        }
        return cnt>1?-1:ans;
    }
}