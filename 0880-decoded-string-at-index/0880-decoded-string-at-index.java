class Solution {
    // public String decodeAtIndex(String s, int k) {
    //     if(k==1 && s.length()>1) return s.charAt(k-1)+"";
    //     StringBuilder sb = new StringBuilder();
    //     for(char c: s.toCharArray()){
    //         if(!Character.isLetter(c)){
    //             int i = Integer.parseInt(c+"")-1;
    //             String a = sb.toString();
    //             for(int j=0; j<i;j+=1){
    //                 sb.append(a);
    //             }
    //             // System.out.println(i+" -> "+sb.toString());
    //         }
    //         else{
    //             sb.append(c);
    //         }
    //     }
    //     return ""+sb.toString().charAt(k-1);
    // }
    //TLE
    
    
    public String decodeAtIndex(String S, int K) {
        int i;
        long N = 0;
        for (i = 0; N < K; i++) {
            N = Character.isDigit(S.charAt(i)) ? N * (S.charAt(i) - '0') : N + 1;
        }
        for (i--; i > 0; i--) {
            if (Character.isDigit(S.charAt(i))) {
                N /= S.charAt(i) - '0';
                K %= N;
            }
            else {
                if (K % N == 0) {
                    break;
                }
                N--;
            }
        }
        return Character.toString(S.charAt(i));
    }
}
