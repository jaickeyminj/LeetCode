class Solution {
    // public int canBeTypedWords(String text, String brokenLetters) {
    //     Set<Character> set=new HashSet<>();
    //     for (char brokenLetter: brokenLetters.toCharArray()){
    //         set.add(brokenLetter);
    //     }
    //     boolean flag=true;
    //     int res=0;
    //     for (char ch:text.toCharArray()){
    //         if (ch==' '){
    //             if (flag){
    //                 res++;
    //             } else {
    //                 flag=true;
    //             }
    //         }
    //         if (set.contains(ch)){
    //             flag=false;
    //         }
    //     }
    //     if (flag){
    //         res+=1;
    //     }
    //     return res;
    // }
    public int canBeTypedWords(String text, String brokenLetters) {
        int map[]= new int[26];
        for (char brokenLetter: brokenLetters.toCharArray()){
            map[(brokenLetter)-'a']=1;
        }
        boolean flag=true;
        int res=0;
        for (char ch:text.toCharArray()){
            if (ch==' '){
                if (flag){
                    res+=1;
                } 
                flag=true;
            }
            else if(map[(ch)-'a']==1){
                flag=false;
            }
        }
        if (flag){
            res+=1;
        }
        return res;
    }
}