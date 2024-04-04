class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(char c: s.toCharArray()){
            if(c=='('){count++;}
            else if(c==')')count--;
            
            max=Math.max(max,count);
        }
        return max;
    }
}