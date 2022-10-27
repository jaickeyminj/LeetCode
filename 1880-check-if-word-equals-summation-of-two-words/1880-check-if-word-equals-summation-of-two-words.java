class Solution {
    // public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
    //     StringBuilder a,b,cc;
    //     a = new StringBuilder();
    //     b = new StringBuilder();
    //     cc = new StringBuilder();
    //     for(char c: firstWord.toCharArray()){
    //         a.append((c-97)+"");
    //     }
    //     for(char c: secondWord.toCharArray()){
    //         b.append((c-97)+"");
    //     }
    //     for(char c: targetWord.toCharArray()){
    //         cc.append((c-97)+"");
    //     }
    //     return Integer.parseInt(a.toString())+Integer.parseInt(b.toString()) 
    //         == Integer.parseInt(cc.toString());
    // }
    
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getIntValue(firstWord) + getIntValue(secondWord) == getIntValue(targetWord);
    }
    private int getIntValue(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++)
            result = result * 10 + (s.charAt(i) - 'a');
        return result;
    }
    
}