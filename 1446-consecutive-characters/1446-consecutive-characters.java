class Solution {
    public int maxPower(String s) {
        int max =0;
        int count =0;
        if(s.length()==1) return 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)== s.charAt(i-1)){
                count+=1;
            }
            else{
                max = Math.max(max,count+1);
                count =0;
            }
        }
        if(count!=0) count+=1;
        return Math.max(max,count);
    }
}