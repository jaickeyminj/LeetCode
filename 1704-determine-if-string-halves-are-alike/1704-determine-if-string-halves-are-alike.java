class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String a = s.substring(0,len/2);
        String b = s.substring(len/2);
        int count1 = 0;
        int count2 = 0;
        
        for(char c: a.toCharArray()){
            if(c==97|| c== 101|| c== 105||c== 111 || c==117 || c==65|| c==69||c== 73|| c==79|| c== 85)
                count1+=1;
        }
        for(char c: b.toCharArray()){
            if(c==97|| c== 101|| c== 105||c== 111 || c==117 || c==65|| c==69||c== 73|| c==79|| c== 85)
                count2+=1;
        }
        
        return count1==count2;
    }
}