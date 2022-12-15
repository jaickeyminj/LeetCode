class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char a[] = text1.toCharArray();
        char b[] = text2.toCharArray();
        
        int mat[][] = new int[a.length+1][b.length+1];
        int max = 0;
        
        for(int i=1;i<mat.length;i+=1){
            for(int j=1;j<mat[i].length;j+=1){
                if(a[i-1] == b[j-1]){
                    mat[i][j] = mat[i-1][j-1]+1;
                }
                else{
                    mat[i][j]= Math.max(mat[i-1][j],mat[i][j-1]);
                }
                if(max<mat[i][j]){
                    max = mat[i][j];
                }
            }
        }
        // System.out.println(Arrays.deepToString(mat));
        return max;
        // return lcsDynamic(text1.toCharArray(),text2.toCharArray());
    }
    public int lcsDynamic(char str1[],char str2[]){
    
        int temp[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        for(int i=1; i < temp.length; i++){
            for(int j=1; j < temp[i].length; j++){
                if(str1[i-1] == str2[j-1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                }
                else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j] > max){
                    max = temp[i][j];
                }
            }
        }
        return max;
    
    }
}