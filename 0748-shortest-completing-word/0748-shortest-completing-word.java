class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        licensePlate = licensePlate.replaceAll("\\s+","").replaceAll("([0-9])","").replaceAll("([A-Z])", "$1").toLowerCase();
        int map[] = new int[26];
        for(char c: licensePlate.toCharArray()){
            map[c-'a']+=1;
        }
        Arrays.sort(words, Comparator.comparing(s->s.length()));
        for(String word:words){
            if(word.length()>=licensePlate.length()){
                if(processAlpha(word,map)){
                    return word;
                }
            }
        }
        return licensePlate;
    }
    public boolean processAlpha(String word, int map[]){
        int map2[] = new int[26];
        
        for(char c: word.toCharArray()){
            map2[c-'a']+=1;
        }
        for(int i=0;i<26;i+=1){
            if(map[i]!=0 && map[i]>map2[i])
                return false;
        }
        
        return true;
    }
}