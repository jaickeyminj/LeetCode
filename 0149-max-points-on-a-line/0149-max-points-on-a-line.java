class Solution {
    public int maxPoints(int[][] points) {
        int len = points.length;
        if(len==1)
            return 1;
        int max =2;
        if(len<=2)
            return max;
        for(int i=0;i<len;i+=1){
            for(int j=i+1;j<len;j+=1){
                int cur =2;
                for(int k=0;k<len;k+=1){
                    if(k!=i&&k!=j){
                        int x =(points[j][1]-points[i][1])*(points[k][0]-points[i][0]);
                        int y= (points[k][1]-points[i][1])*(points[j][0]-points[i][0]);
                        if(x==y){
                            cur+=1;
                        }
                    }
                }
                max = Math.max(max,cur);
            }
        }
        return max;
    }
}