class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int map[] = new int[26];
        
        for(int i=0;i<word1.length();i+=1){
            map[word1.charAt(i)-'a']+=1;
            map[word2.charAt(i)-'a']-=1;
        }
        System.out.println(Arrays.toString(map));
        for(int i: map){
            if(i>3 || i<-3) return false;
        }
        return true;
    }
}