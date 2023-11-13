class Solution {
    public String sortVowels(String s) {
//         97, 101, 105, 111, and 117 (Lower-Case)
//         65, 69, 73, 79, and 85 (Upper-Case)
        PriorityQueue<Character> pq = new PriorityQueue<>();
        PriorityQueue<Character> pq2 = new PriorityQueue<>();
        for(char c: s.toCharArray()){
            if(c==97 || c== 101 || c==105 || c== 111 || c== 117){
                pq.add(c);
            }
            else if(c== 65 || c== 69 || c== 73 || c== 79 || c==85){
                pq2.add(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c==97 || c== 101 || c==105 || c== 111 || c== 117 
               ||c== 65 || c== 69 || c== 73 || c== 79 ||c== 85){
                if(pq2.size()>0){
                    sb.append(pq2.poll());
                }
                else if(pq.size()>0){
                    sb.append(pq.poll());
                }
            }
            else
                sb.append(c);
        }
        
        return sb.toString();
    }
}