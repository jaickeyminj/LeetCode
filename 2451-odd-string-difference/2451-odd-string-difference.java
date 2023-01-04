class Solution {
    public String oddString(String[] words) {
        // Map<Integer[],List<String>> map = new HashMap<>();
        // Arrays.sort(words);
        int row = words.length;
        int cols = words[0].length();
        Integer x[][]=  new Integer[row][cols-1];
        // Arrays.fill(x,100);
        for(int i=0;i<row;i+=1){
            for(int j=0;j<cols-1;j+=1){
                x[i][j] =findChar(words[i].charAt(j+1))-findChar(words[i].charAt(j));
                
            }
        }
        // System.out.println(Arrays.deepToString(x));
        for(int i=1;i<row-1;i+=1){
            for(int j=0;j<cols-1;j+=1){
            if(x[i][j]==x[i+1][j] && x[i-1][j]!=x[i][j])
                return words[i-1];
            if(x[i-1][j]==x[i+1][j] && x[i+1][j]!=x[i][j])
                return words[i];
            if(x[i][j]==x[i-1][j] && x[i+1][j]!=x[i][j])
                return words[i+1];
            }
        }
        return ""+words[words.length-1];
    }
    
    public int findChar(char a){
        return a-'a';
    }
}