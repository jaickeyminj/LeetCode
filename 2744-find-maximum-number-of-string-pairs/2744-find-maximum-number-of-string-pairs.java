// class Solution {
//     public int maximumNumberOfStringPairs(String[] words) {
//         Map<String,Integer> map = new HashMap<>();
//         for(String w: words){
//             StringBuffer sb = new StringBuffer();
//             sb.append(w);
//             if(w.equals(sb.reverse().toString())){}
//             else
//                 map.put(w,0);
//         }
        
//         int cnt = 0;
//         for(String s: map.keySet()){
//             StringBuffer sb = new StringBuffer();
//             sb.append(s);
//             if(map.containsKey(sb.reverse().toString()))
//                 cnt+=1;
//         }        
//         return cnt/2;
//     }
// }
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        for(int i = 0 ; i < words.length - 1; i++){
            for(int j = i + 1 ; j < words.length ; j++){
                if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0))ans++;
            }
        }
        return ans;
    }
}