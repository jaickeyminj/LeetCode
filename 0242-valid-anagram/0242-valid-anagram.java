class Solution {
    public boolean isAnagram(String s, String t) {
        int n= s.length();
        int m = t.length();
        if(n!=m) return false;
        int count[]= new int[26];
        // int n= s.length();
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++) if(count[i]!=0) return false;
        return true;
    }
}