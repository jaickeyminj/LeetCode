class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(String w: words){
            sb.append(w.charAt(0));
        }
        return s.equals(sb.toString());
    }
}