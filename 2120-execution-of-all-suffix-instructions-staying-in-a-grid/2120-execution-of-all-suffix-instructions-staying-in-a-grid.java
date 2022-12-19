class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        
        int []execute = new int [s.length()];

        for(int i=0;i<s.length();i++){
            int []nextBox = new int []{startPos[0],startPos[1]};
            for(int j=i;j<s.length();j++){
                nextBox = boxNumber(s.charAt(j),nextBox);
                if(nextBox[0]<0|| nextBox[0] == n||nextBox[1]<0||nextBox[1]==n){
                    break;
                }
                execute[i]++;
            }
        }
        return execute;
    }
    private int []boxNumber(char letter, int []cbox){

        if(letter == 'R'){
            cbox[1]++;
        }
        else if (letter == 'L'){
            cbox[1]--;
        }
        else if(letter == 'U'){
            cbox[0]--;
        }
        else{
            cbox[0]++;
        }
        return cbox;
    }
}