class Solution {
    public boolean makeEqual(String[] words) {
        
        int[] freq = new int[26];
        
        for(String str : words){
            
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                
                freq[ch-'a']++;
            }
            
        }
        
        for(int f : freq){
            if(f > 0 && f % words.length != 0){
                return false;
            }
        }
        
        return true;
    }
}