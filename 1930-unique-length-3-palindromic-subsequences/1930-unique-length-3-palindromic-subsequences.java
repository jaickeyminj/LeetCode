/*class Solution {
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
}*/

class Solution {
    public int countPalindromicSubsequence(String s) {
        
        int n = s.length();
        
        char[] chArr = s.toCharArray();
        
        int[] firstOcc = new int[26];
        int[] lastOcc = new int[26];
        
        Arrays.fill(firstOcc, -1);
        Arrays.fill(lastOcc, -1);
        
        for(int i = 0; i < n; i++){
            
            char ch = chArr[i];
            
            if(firstOcc[ch - 'a'] == -1){
                firstOcc[ch - 'a'] = i;
            }
            
            lastOcc[ch - 'a'] = i;
        }
        
        int ans = 0, count = 0;
        
        boolean[] visited;
        
		// check for each character ( start or end of palindrome )
        for(int i = 0; i < 26; i++){
            
            int si = firstOcc[i]; // si - starting index
            int ei = lastOcc[i]; // ei - ending index
            
            visited = new boolean[26];
            
            count = 0;
            
			// check for unique charcters ( middle of palindrome )
            for(int j = si + 1; j < ei; j++){
                
                if(!visited[chArr[j] - 'a']){
                    visited[chArr[j] - 'a'] = true;
                    count++;
                }
            }
            
            ans += count;
        }
        
        return ans;
    }
}