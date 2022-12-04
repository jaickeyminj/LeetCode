class Solution {
    public boolean isCircularSentence(String sentence) {
        String a[] = sentence.split("\\s+");
        if(a[0].charAt(0)!= a[a.length-1].charAt(a[a.length-1].length()-1))
            return false;
        char x='a';
        char y ='d';
        for(int i=0;i<a.length-1;i+=1){
            x= a[i].charAt(a[i].length()-1);
            y = a[i+1].charAt(0);
            if(x!=y) return false;
        }
        return true;
    }
}