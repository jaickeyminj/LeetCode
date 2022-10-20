class Solution {
    public String greatestLetter(String s) {
        int lower[] = new int[26];
        int upper[] = new int[26];
        
        for(char c: s.toCharArray()){
            if(Character.isLowerCase(c)){
                lower[c-'a']=1;
            }
            else{
                upper[c-'A']=1;
            }
            
        }
        for(int i=26-1;i>=0;i-=1){
            if(lower[i]!=0 && upper[i]!=0&&lower[i]==upper[i]){
                // if(lower[c-'a']==upper[c-'a']){
                return String.valueOf(""+(char)(65+i));
            // }
            }
        }
        
        return "";
    }
}