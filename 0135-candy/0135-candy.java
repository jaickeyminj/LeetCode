class Solution {
    public int candy(int[] ratings) {
        int ans = 0;
        int res[] = new int[ratings.length];
        res[0]= 1;
        Arrays.fill(res,1);
        for(int i=1;i<res.length;i+=1){
            if(ratings[i-1]< ratings[i]) 
                res[i]=res[i-1]+1;
            // else
            //     res[i]=1;
        }
        // System.out.println(Arrays.toString(res));
        int res2[] = new int[ratings.length];
        res2[res2.length-1] = 1;
        Arrays.fill(res2,1);
        for(int i=res2.length-2;i>=0;i-=1){
            if(ratings[i+1] < ratings[i])
                res2[i] = res2[i+1] + 1;
            // else
            //     res2[i]=1;
        }
        // System.out.println(Arrays.toString(res2));
        for(int i=0;i<res.length;i+=1){
            ans+= Math.max(res[i],res2[i]);
        }
        return ans;
    }
}