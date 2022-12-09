class Solution {
    public String frequencySort(String s) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(char c :s.toCharArray()){
            hm.put(c+"",hm.getOrDefault(c+"",0)+1);
        }
        List<Map.Entry<String, Integer> > list
            = new LinkedList<Map.Entry<String, Integer> >(
                hm.entrySet());
 
        Collections.sort(
            list,
            (i1,
             i2) -> i1.getValue().compareTo(i2.getValue()));
 
       
        String res="";
        for (Map.Entry<String, Integer> aa : list) {
            for(int i=0;i<aa.getValue();i++){
                res = aa.getKey()+res;
            }
        }
        // return temp;
        return ""+res;
    }
}