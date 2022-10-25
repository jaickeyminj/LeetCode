class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder result =  new StringBuilder();
        char c='a';
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c==' '){
                result.append(sb.reverse().toString()+" ");
                sb = new StringBuilder();
            }
            else
                sb.append(c);
        }
        if(sb.length()>0)
            return result.append(""+sb.reverse().toString()).toString();
        return result.toString();
    }
}