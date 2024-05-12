class Solution {
    public int findPermutationDifference(String s, String t) {
        int map[] = new int[26];
        
        for(int i=0;i<s.length();i+=1){
            char c = s.charAt(i);
            map[c-'a'] = Math.abs(s.indexOf(c)-t.indexOf(c));
        }
        
        int sum = 0;
        for(int i:map){
            sum+=i;
        }
        
        return sum;
    }
}