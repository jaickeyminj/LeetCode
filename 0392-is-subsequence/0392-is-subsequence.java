class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        
        for(int i=0;i<t.length() && j<s.length(); i+=1){
            if(s.charAt(j)== t.charAt(i))
                j+=1;
        }
        return j== s.length();
    }
}