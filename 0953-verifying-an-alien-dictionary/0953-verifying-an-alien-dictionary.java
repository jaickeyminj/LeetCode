// class Solution {
//     public boolean isAlienSorted(String[] words, String order) {
//         Map<Character, Character> map = new HashMap<>();
//         for(int i=0;i<order.length();i++){
//             char c = order.charAt(i);
//             map.put(c, (char)('a'+i));
//         }
//         for(int i=1;i<words.length;i++){
//             if(helper(words, map, i-1, i)){
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public boolean helper(String[] words, Map<Character, Character> map, int i, int j){
//         StringBuilder sb = new StringBuilder();   
//         String stri = words[i];
//         String strj = words[j];
        
//         for(char c: stri.toCharArray()){
//             sb.append(map.get(c));
//         }
        
//         String resStri = sb.toString();
//         sb.setLength(0);
//         for(char c: strj.toCharArray()){
//             sb.append(map.get(c));
//         }
//         String resStrj = sb.toString();
//         return resStri.compareTo(resStrj)>0;
//     }
    
// }

class Solution {
    private int[] x = new int[26];

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); ++i) x[order.charAt(i) - 'a'] = i;
        for (int i = 0; i < words.length; ++i) {
            for (int j = i + 1; j < words.length; ++j) {
                String a = words[i], b = words[j];
                int ml = Math.max(a.length(), b.length());
                for (int m = 0; m < ml; ++m) {
                    int p = a.length() > m ? x[a.charAt(m) - 'a'] : -1;
                    int q = b.length() > m ? x[b.charAt(m) - 'a'] : -1;
                    if (p < q) break;
                    if (p > q) return false;
                }
            }
        }
        return true;
    }
}