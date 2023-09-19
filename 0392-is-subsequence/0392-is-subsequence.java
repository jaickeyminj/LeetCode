class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int j=0;
        
//         for(int i=0;i<t.length() && j<s.length(); i+=1){
//             if(s.charAt(j)== t.charAt(i))
//                 j+=1;
//         }
//         return j== s.length();
//     }
    public boolean isSubsequence(String s, String t) {
        int i = 0 , j = 0;
        int n = t.length() , m = s.length(); 
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();

        if(m < 1)   return true;

        while(i < n){
        if(tt[i] == ss[j]){
            j++;
        }
        i++;
        if(j==m)    return true;
        }
        return false;
    }
}