class Solution {
    public int appendCharacters(String s, String t) {
        // int m=s.length();
        // int n=t.length();
        // int j=0;int i=0;
        // while(i<m && j<n){
        //     if(s.charAt(i)==t.charAt(j)){
        //         j++;
        //     }  
        //     i++;  
        // }
        // return t.length()-j; 
        
        int idx = 0;
        for(int i = 0;i<s.length();){
            while(idx<t.length() && i<s.length() && s.charAt(i) == t.charAt(idx)){
                idx++;
                i++;
            }
            i++;
        }
        return t.length() - idx;
    }
}