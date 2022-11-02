class Solution {
//     public boolean areOccurrencesEqual(String s) {
//         int len = s.length();
//         if(len==1) return true;
        
//         Map<Character,Integer> hm = new HashMap<>();
//         for(char c: s.toCharArray()){
//             hm.put(c,hm.getOrDefault(c,0)+1);
//         }
//         int count = hm.get(s.charAt(0));
//         int size = hm.size();
//         for(Map.Entry<Character,Integer> entry: hm.entrySet()){
//             if(entry.getValue()!=count) return false;
//         }
//         return true;
//     }
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        int prev = freq[s.charAt(0) - 'a'];
        for(int num: freq){
		    if(num > 0 && num != prev){
                return false;
            }
        }
        return true;
    }
}