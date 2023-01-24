class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder(),
        sb2 = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c!='#') sb.append(c);
            else
                if(sb.length()>0)
                    sb.deleteCharAt(sb.length()-1);
        }
        for(char c: t.toCharArray()){
            if(c!='#') sb2.append(c);
            else 
                if(sb2.length()>0)
                    sb2.deleteCharAt(sb2.length()-1);
        }
        return sb.toString().equals(sb2.toString());
    }
}