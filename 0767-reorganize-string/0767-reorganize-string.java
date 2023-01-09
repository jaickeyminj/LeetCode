class Solution {
    public String reorganizeString(String s) {
        int len = s.length();
        if(len==1)
            return s;
        else if(len==2)
            return s.charAt(0)!=s.charAt(1)?s:"";
        else{
            int freq[]= new int[26];
            for(char c: s.toCharArray())
                freq[c-'a']+=1;
            char res[]= new char[len];
            int max =0;
            int index =0;
            for(int i=0;i<26;i+=1){
                if(freq[i]>max){
                    max = freq[i];
                    index =i;
                }
            }
            if (max > (s.length() + 1) / 2) {
            return ""; 
            }
            int idx = 0;
            while(freq[index]>0){
                res[idx] = (char) (index + 'a');
                idx += 2;
                freq[index]--;
            }
            for (int i = 0; i<freq.length; i+=1) {
                while (freq[i] > 0) {
                    if (idx >= res.length) {
                        idx = 1;
                    }
                    res[idx] = (char) (i + 'a');
                    idx += 2;
                    freq[i]-=1;
                }
            }
            return new String(res);
        }
    }
}