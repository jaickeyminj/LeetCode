class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(char c: s.toCharArray())
            if(c==letter)
                count+=1;
        double len = s.length();
        double per = (count/len) *100;
        return (int) per;
    }
}