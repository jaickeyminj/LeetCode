class Solution {
    // public int maxPoints(int[][] points) {
    //     int len = points.length;
    //     if(len==1)
    //         return 1;
    //     int max =2;
    //     if(len<=2)
    //         return max;
    //     for(int i=0;i<len;i+=1){
    //         for(int j=i+1;j<len;j+=1){
    //             int cur =2;
    //             for(int k=0;k<len;k+=1){
    //                 if(k!=i&&k!=j){
    //                     int x =(points[j][1]-points[i][1])*(points[k][0]-points[i][0]);
    //                     int y= (points[k][1]-points[i][1])*(points[j][0]-points[i][0]);
    //                     if(x==y){
    //                         cur+=1;
    //                     }
    //                 }
    //             }
    //             max = Math.max(max,cur);
    //         }
    //     }
    //     return max;
    // }
    public int maxPoints(int[][] points) {
        int len = points.length;
        if(len<=2)
            return len;
        Set<String> set = new HashSet<>();
        
        int max =1;
        for(int i=0;i<len&& !set.contains(points[i][0]+"-"+points[i][1]);i+=1){
            
            int localMax =1;
            int same = 0;
            int a[]= points[i];
            Map<Double,Integer> map = new HashMap<>();
            for(int j=i+1;j<len;j+=1){
                if(isSame(a,points[j])){
                    same+=1;
                    continue;
                }else{
                    double slope = getSlope(a,points[j]);
                    map.put(slope,map.getOrDefault(slope,1)+1);
                    localMax = Math.max(localMax,map.get(slope));
                }
            }
            set.add(a[0]+"-"+a[1]);
            max = Math.max(max,localMax+same);
        }
        return max;
    }
    
    private boolean isSame(int a[],int b[]){
        return a[0]==b[0]&&a[1]==b[1];
    }
    
    private double getSlope(int a[],int b[]){
        if(a[0]==b[0]) return Double.MAX_VALUE;
        if(a[1]==b[1]) return 0;
        return ((double)a[0]-b[0])/((double)a[1]-b[1]);
    }
}