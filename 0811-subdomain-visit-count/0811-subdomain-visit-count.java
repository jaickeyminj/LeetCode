class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String a: cpdomains){
            int index = a.indexOf(' ');
            int visit = Integer.parseInt(a.substring(0, index));
            String domain = a.substring(index + 1);
            hm.put(domain,hm.getOrDefault(domain,0)+(visit));
            
            for(int i=0;i<domain.length();i+=1){
                if(domain.charAt(i)=='.'){
                            hm.put(domain.substring(i+1),
                                   hm.getOrDefault(domain.substring(i+1),0)+
                                   (visit));
                }
            }
        }
        List<String> ans = new ArrayList<>();
        // StringBuilder sb = null;
        for(String d: hm.keySet()){
            StringBuilder sb = new StringBuilder();
            sb.append(hm.get(d)).append(" ").append(d);
            ans.add(sb.toString());
        }
        return ans;
    }
}