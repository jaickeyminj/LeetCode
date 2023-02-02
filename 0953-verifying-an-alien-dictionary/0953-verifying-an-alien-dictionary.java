class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Character> map = new HashMap<>();
        for(int i=0;i<order.length();i++){
            char c = order.charAt(i);
            map.put(c, (char)('a'+i));
        }
        for(int i=1;i<words.length;i++){
            if(helper(words, map, i-1, i)){
                return false;
            }
        }
        return true;
    }
    
    public boolean helper(String[] words, Map<Character, Character> map, int i, int j){
        StringBuilder sb = new StringBuilder();   
        String stri = words[i];
        String strj = words[j];
        
        for(char c: stri.toCharArray()){
            sb.append(map.get(c));
        }
        
        String resStri = sb.toString();
        sb.setLength(0);
        for(char c: strj.toCharArray()){
            sb.append(map.get(c));
        }
        String resStrj = sb.toString();
        return resStri.compareTo(resStrj)>0;
    }
    
}