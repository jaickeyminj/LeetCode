class Solution {
    public int numberOfSpecialChars(String word) {
        int map1[] = new int[26];
        int map2[] = new int[26];
        
        for(char c: word.toCharArray()){
            if(Character.isLowerCase(c)){
                map1[c-'a']+=1;
            }
            else{
                map2[c-'A']+=1;
            }
        }
        int cnt=0;
        for(int i=0;i<26;i+=1){
            if(map1[i]!=0 && map2[i]!=0){
                cnt+=1;
            }
        }
        
        return cnt;
    }
}