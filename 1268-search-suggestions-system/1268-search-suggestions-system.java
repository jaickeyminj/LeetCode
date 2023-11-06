class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> list = new ArrayList<>();
        List<String> al;
        PriorityQueue<String> pq= addProducts(products);
        
        for(int i=0;i<searchWord.length();i+=1){
            String word = searchWord.substring(0,i+1);
            // if(word.length()==0) continue;
            al = new ArrayList<>();
            // System.out.println(word);
            while(pq.size()>0 && al.size()<3){
                String w = pq.poll();
                if(w.startsWith(word)){
                    al.add(w);
                }
            }
            pq = addProducts(products);
            list.add(al);
        }
        return list;
    }
    
    public PriorityQueue<String> addProducts(String p[]){
        PriorityQueue<String> pq = new PriorityQueue<String>();
        for(String s: p){
            pq.offer(s);
        }
        return pq;
    }
}