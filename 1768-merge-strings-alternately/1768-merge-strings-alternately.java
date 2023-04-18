class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb= new StringBuilder();
        int i=0;
        int j=0;
        for(i=0,j=0;i<word1.length()&&j<word2.length();){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        
         return sb.append(i<word1.length()?word1.substring(i):word2.substring(j)).toString();
        
        // return ""+sb.toString();
        
    }
}