class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        Set<Character> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        
        for(int i=0;i<s.length();i+=1){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            
            if(map.get(s.charAt(i))==0){
                map.remove(s.charAt(i));
            }
            
            for(int j=0;j<26;j+=1){
                char c = (char)('a'+j);
                if(set.contains(c) && map.containsKey(c)){
                    set2.add(c+""+s.charAt(i)+""+c);
                }
            }
            set.add(s.charAt(i));
        }
        
        return set2.size();
    }
}