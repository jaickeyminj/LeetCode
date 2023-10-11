class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        for(String w: words){
            StringBuffer sb = new StringBuffer();
            sb.append(w);
            if(w.equals(sb.reverse().toString())){}
                
            else
                map.put(w,0);
        }
        
        int cnt = 0;
        // System.out.println(map);
        // System.out.println(map.containsKey("ca"));
        for(String s: map.keySet()){
            StringBuffer sb = new StringBuffer();
            sb.append(s);
            // System.out.println(s+" - "+(new StringBuffer().append(s).reverse()));
//             if(s.equals(sb.reverse())){
                
//             }
//             else //
                if(map.containsKey(sb.reverse().toString()))//(sb.reverse().equals(s)))//{
                    cnt+=1;
            // System.out.println(s+" - "+(new StringBuffer().append(s).reverse()));}
        }
        
        return cnt/2;
    }
}