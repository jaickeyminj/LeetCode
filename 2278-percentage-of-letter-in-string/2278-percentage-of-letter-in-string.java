class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(char c: s.toCharArray())
            if(c==letter)
                count+=1;
        // System.out.println(count);
        double len = s.length();
        double per = (count/len) *100;
        // System.out.println(per);
        // System.out.println( per * 100);
        return (int) per;
    }
}