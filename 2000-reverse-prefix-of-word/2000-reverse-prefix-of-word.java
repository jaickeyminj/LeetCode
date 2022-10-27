class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        char c='a';
        for(;i<word.length();i+=1){
            c= word.charAt(i);
            sb.append(c);
            if(ch==c){
                break;
            }
        }
        if(i!=word.length())
            return sb.reverse().toString() + word.substring(i+1);
        return sb.toString();
    }
}