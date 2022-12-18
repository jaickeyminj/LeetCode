class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        
        for(int i=0;i<words.length-1;i+=1){
            int map1[]= new int[26];
            String a = words[i];
            
            for(char c: a.toCharArray()){
                map1[c-'a']+=1;
            }
            for(int j=i+1;j<words.length;j+=1){
                // Arrays.fill(map1,0);
                // Arrays.fill(map2,0);
                
                int map2[]= new int[26];
                
                String b = words[j];
                
                for(char c: b.toCharArray()){
                    map2[c-'a']+=1;
                }
                int k;
                for(k=0;k<26;k+=1){
                    if((map1[k]==0 && map2[k]!=0)|| (map2[k]==0 && map1[k]!=0)){
                        break;
                    }
                }
                if(k==26) count+=1;
            }
        }
        return count;
    }
}