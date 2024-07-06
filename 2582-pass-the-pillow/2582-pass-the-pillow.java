class Solution {
    public int passThePillow(int n, int time) {
        int ans = 1;
        int counter = 0;
        boolean flag = true;
        while(counter<time){
            counter+=1;
            if(flag){
                ans+=1;
                if(ans==n){
                    flag = false;
                }
            }
            else{
                ans-=1;
                if(ans==1){
                    flag = true;
                }
            }
        }
        return ans;
    }
}