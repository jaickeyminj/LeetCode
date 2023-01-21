class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<>();
        if(digits == null || digits.length() == 0) return l;
        HashMap<Character, String> map = buildMap();
        solve(digits, 0, l, map, "");
        return l;
    }
    
    private void solve(String digits, int index, List<String> l, HashMap<Character, String> map, String res){
        if(index == digits.length()) {
            l.add(res);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i = 0; i < letters.length(); i++){
            String newString = res + letters.charAt(i);
            solve(digits, index + 1, l, map, newString);
        }
    }
    
    private HashMap<Character, String> buildMap(){
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
    
}