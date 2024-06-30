class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int res1 = 0, res2 = 0, c = 1, r = red, b = blue;

        // Case 1: Take red first
        while(true) {
            if(c % 2 != 0) {
                if(red < c) break;
                red -= c;
            }
            else {
                if(blue < c) break;
                blue -= c;
            }
            c++;
            res1++;
            if(red < 0 || blue < 0) break;
            
        }

        // Case 2: Take blue first
        c = 1;
        while(true) {
            if(c % 2 != 0) {
                if(b < c) break;
                b -= c;
            }
            else {
                if(r < c) break;
                r -= c;
            }
            c++;
            res2++;
            if(r < 0 || b < 0) break;
        }
        
        return Math.max(res1,res2);
    }
}