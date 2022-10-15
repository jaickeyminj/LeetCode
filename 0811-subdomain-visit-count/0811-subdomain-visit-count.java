class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String a: cpdomains){
            String split[] = a.split("\\s+");
            hm.put(split[1],hm.getOrDefault(split[1],0)+Integer.parseInt(split[0]));
            
            for(int i=0;i<split[1].length();i+=1){
                if(split[1].charAt(i)=='.'){
                            hm.put(split[1].substring(i+1),
                                   hm.getOrDefault(split[1].substring(i+1),0)+
                                   Integer.parseInt(split[0]));
                }
            }
        }
        // System.out.println(hm);
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: hm.entrySet()){
            ans.add(entry.getValue()+" "+entry.getKey());
        }
        return new ArrayList<String>(ans);
    }
}