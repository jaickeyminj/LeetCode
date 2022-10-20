class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int map[]= new int[26];
        boolean flag[]= new boolean[26];
        int c=97;
        for(int i=0;i<s.length();i++){
            c= s.charAt(i)-'a';
            if(!flag[c]){
                map[c]=i+1;
                flag[c]=true;
            }
            else if(i-map[c] != distance[c]){
                return false;
            }        
        }
        return true;
    }
    
}