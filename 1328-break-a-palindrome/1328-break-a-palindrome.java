class Solution {
    public String breakPalindrome(String palindrome) {
        int length = palindrome.length();
        if(length == 1) return "";
//         else if(length ==2){
//             char c[] = palindrome.toCharArray();
//             c[1] = (char)(c[0]+1);
            
//             return new String(c);
//         }
        
        char c[] = palindrome.toCharArray();
        int i=0;
        int j= length-1;
        boolean flag = false;
        while(i<j){
            if(c[i]!='a'){
                c[i]='a';
                flag = true;
                break;
            }
            i+=1;
            j-=1;
        }
        if(!flag){
            c[length-1]='b';
        }
        return new String(c);
    }
}