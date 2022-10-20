class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int map[]= new int[26];
        boolean flag[]= new boolean[26];
        for(int i=0;i<s.length();i++){
            if(!flag[s.charAt(i)-'a']){
                map[s.charAt(i)-'a']=i+1;
                flag[s.charAt(i)-'a']=true;
            }
            else if(i-map[s.charAt(i)-'a'] != distance[s.charAt(i)-'a']){
                // map[s.charAt(i)-'a'] = i- map[s.charAt(i)-'a']-1;
                return false;
            }
                
        }
        // System.out.println(Arrays.toString(map));
        // for(int i=0;i<26;i++){
        //     if(map[i]!=0 && (map[i]!=distance[i]))
        //         return false;
        // }
        return true;
    }
    
}