class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {     
        // int index =0;
        // int res[] = new int[queries.length];
        // for(String q: queries){
        //     PriorityQueue<Map.Entry<Character,Integer>> pq = getPQ(q);
        //     int freq = pq.peek().getValue();
        //     for(String w: words){
        //         PriorityQueue<Map.Entry<Character,Integer>> pq2 = getPQ(w);
        //         int freq2= pq2.poll().getValue();
        //         if(freq2>freq){
        //             res[index]+=1;
        //         }
        //     }
        //     index+=1;
        // }
        // return res;
        
        int [] fCount = new int[11];
        for(String word : words){
            int count = getFCount(word);
            fCount[count]++;
        }
        int sum = 0;
        for(int i=0;i<fCount.length;i++){
            sum += fCount[i];
            fCount[i] = sum;
        }
        int [] res = new int[queries.length];
        for(int i=0;i<queries.length;i++){  
            int count = getFCount(queries[i]);
            res[i] = fCount[fCount.length -1] - fCount[count];
        }
        return res; 
    }
    
    public int getFCount(String word){
        int [] count = new int[26];
            
        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-'a']++;
        }

        for(int i=0;i<count.length;i++){            
            if(count[i] != 0){
                return count[i];
            }
        }
        
        return 0;
    }
    
    private PriorityQueue<Map.Entry<Character,Integer>> getPQ(String q){
        Map<Character,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character,Integer>> pq;
            pq = new PriorityQueue<>((a,b)->{
                return a.getKey()-b.getKey();
            });
            for(char c:q.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Character,Integer> m: map.entrySet()){
                pq.offer(m);
            }
        return pq;
    }
    
}