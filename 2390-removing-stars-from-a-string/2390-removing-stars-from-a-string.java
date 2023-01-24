class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char a: s.toCharArray()){
            if(a!='*') sb.append(a);
            else sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}