class Solution {
    public boolean isPathCrossing(String path) {
        // int a[]= new int[]{0,0};
        Set<String> set = new HashSet<>();
        set.add(0+","+0);
        int x =0;
        int y =0;
        for(char c: path.toCharArray()){
            if(c=='N'){
                x +=1;
            }
            else if(c=='S'){
                x -=1;
            }
            else if(c=='W'){
                y +=1;
            }
            else{
                y -=1;
            }
            if(!set.add(x+","+y)){
                return true;
            }
            // else
            //     set.add(x+","+y);
        }
        return false;
    }
}