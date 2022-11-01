class Solution {
    public int countCharacters(String[] words, String chars) {
        int map[] = new int[26];
        for(char c: chars.toCharArray()){
            map[c-'a']+=1;
        }
        int count = 0;
        int map2[];
        for(String word:words){
            map2 = new int[26];
            for(char c:word.toCharArray()){
                map2[c-'a']+=1;
            }
            boolean flag = true;
            for(int i=0;i<26;i+=1){
                if(map[i]<map2[i]){
                    flag =!flag;
                    break;
                }
            }
            if(flag){
                count+=word.length();
            }
        }
        
        return count;
    }
}