class Solution {
    public String maximumOddBinaryNumber(String s) {
        int totalCount = s.length(), onesCount=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) =='1') onesCount++;
        }
        int temp = onesCount;
        
        StringBuilder sb = new StringBuilder();
        onesCount -=1;
        while(onesCount > 0){
            sb.append(1);
            onesCount--;
        }
        for(int i=0; i<totalCount - temp; i++){
            sb.append(0);
        }
        sb.append(1);
        return sb.toString();
    }
}