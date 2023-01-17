class Solution {
    public int minFlipsMonoIncr(String s) {
        int len = s.length();
        if(len == 1)
            return 0;
        else{
            int flipCount = 0;
            int onesCount = 0;

            for(int i=0; i<len; i++){
                if(s.charAt(i) == '0'){
                    if(onesCount == 0) continue;
                    else flipCount++;
                }else{
                    onesCount++;
                }
                if(flipCount > onesCount){
                    flipCount = onesCount;
                }
            }
            return flipCount;
        }
    }
}