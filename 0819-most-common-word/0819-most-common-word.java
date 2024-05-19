class Solution {
    public String mostCommonWord(String input, String[] banned) {
        String res = input.replaceAll("[^a-zA-Z\\s]", " ").toLowerCase();
        HashMap<String,Integer> hm = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(String a: banned){
            set.add(a);
        }
        String split[] = res.split("\\s+");
        for(String a:split){
            if(set.contains(a))
                continue;
            else{
                hm.put(a,hm.getOrDefault(a,0)+1);
            }
        }
        int freq = 0;
        // System.out.println(hm);
        String ans = "";
        for(Map.Entry<String,Integer> m: hm.entrySet()){
            if(m.getValue()>freq){
                ans= m.getKey();
                freq = m.getValue();
            }
        }
        return ans;
    }
}