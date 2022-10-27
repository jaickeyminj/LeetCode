class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder a,b,cc;
        a = new StringBuilder();
        b = new StringBuilder();
        cc = new StringBuilder();
        for(char c: firstWord.toCharArray()){
            a.append((c-97)+"");
        }
        for(char c: secondWord.toCharArray()){
            b.append((c-97)+"");
        }
        for(char c: targetWord.toCharArray()){
            cc.append((c-97)+"");
        }
        // System.out.println(a.toString());
        // System.out.println(b.toString());
        // System.out.println(cc.toString());
        return Integer.parseInt(a.toString())+ Integer.parseInt(b.toString()) == Integer.parseInt(cc.toString());
    }
}