class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(;i<word.length();i+=1){
            sb.append(word.charAt(i));
            if(ch==word.charAt(i)){
                break;
            }
        }
        if(i!=word.length())
            return sb.reverse().toString() + word.substring(i+1);
        return sb.toString();
    }
}