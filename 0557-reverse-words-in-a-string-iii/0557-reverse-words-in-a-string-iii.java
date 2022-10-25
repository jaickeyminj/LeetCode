class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        char c='a';
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c==' '){
                // if(i<s.length()-1)
                    result +=sb.reverse().toString()+" ";
                // else
                //     result +=sb.reverse().toString();
                sb = new StringBuilder();
            }
            else
                sb.append(c);
        }
        if(sb.length()>0)
            return result+""+sb.reverse().toString();
        return result;
    }
}