class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> hm = new HashMap<>();
        Map<String,Integer> hm2 = new HashMap<>();
        
        for(String a: words1){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(String a: words2){
            hm2.put(a,hm2.getOrDefault(a,0)+1);
        }
        int count =0;
        for(String a: hm.keySet()){
            if(hm2.getOrDefault(a,0)==1 && hm.get(a)==1){
                count+=1;
            }
        }
        return count;
    }
}