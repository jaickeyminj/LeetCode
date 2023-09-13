class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int minsteps = 0;
        int a = Math.abs(fx-sx);
        int b = Math.abs(fy-sy);
        
        if(a==0 && b==0) return t!=1;
        
        if(a<b) return Math.abs(fy-sy) <=t;
          
        else return Math.abs(fx - sx)<=t;

    }
}